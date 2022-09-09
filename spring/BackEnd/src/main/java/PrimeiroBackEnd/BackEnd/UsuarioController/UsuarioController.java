package PrimeiroBackEnd.BackEnd.UsuarioController;
import PrimeiroBackEnd.BackEnd.entidade.Usuario;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins="*",maxAge=3600)

public class UsuarioController {
@GetMapping(value="/listar-usuarios")
public List<Usuario>listar(){
	//Obter_a_lista
	List<Usuario>lista=new ArrayList<Usuario>();
	Usuario usuario = new Usuario();
	
	usuario.setId(1);
	usuario.setIdade(30);
	usuario.setNome("João");
	usuario.setPerfil("admin");
	
	lista.add(usuario);
	
	usuario = new Usuario();
	
	usuario.setId(2);
	usuario.setIdade(31);
	usuario.setNome("Jack");
	usuario.setPerfil("admin");
	
	lista.add(usuario);
	
	return lista;
	
	}

@GetMapping(value="/consultar-usuario/{id}")
	//consultar_registro
	public Usuario consultar(@PathVariable Integer id) {
	Usuario usuario = new Usuario();
	
	usuario.setId(id);
	usuario.setIdade(id+30);
	usuario.setNome("Samuel Rodriguez");
	usuario.setPerfil("admin");
	
	return usuario;
	}

	@PostMapping(value="/salvar-usuario")
	public Usuario salvar(@RequestBody Usuario usuario) {
		
		//INCLUIR_OU_ALTERAR_SERVIÇO_AQUI
		
		return usuario;
	}
	
	@DeleteMapping(value="/excluir-usuario/{id}")
	public void excluir(@PathVariable Long id) {
		
		//Excluir_registro
	}

}
