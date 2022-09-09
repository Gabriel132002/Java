package PrimeiroBackEnd.BackEnd.entidade;

public class Usuario {
	
	private Integer id;
	private String nome;
	private Integer idade;
	private String perfil;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id=id;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade=idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil=perfil;
	}

}
