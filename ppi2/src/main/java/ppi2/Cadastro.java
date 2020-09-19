package ppi2;

public class Cadastro {

    private Long id;
    private String Nome;
    private String Email;
    private String Senha;

  // métodos get e set para id, nome, email, senha.
	public void Book() {
	}
    
    
  public String getNome() {
    return this.Nome;
  }
  public void setNome(String novo) {
    this.Nome = novo;
  }

  public String getEmail() {
    return this.Email;
  }
  public void setEmail(String novo) {
    this.Email = novo;
  }

  public String getSenha() {
    return this.Senha;
  }
  public void setSenha(String novo) {
    this.Senha = novo;
  }

  public Long getId() {
    return this.id;
  }
  public void setId(Long novo) {
    this.id = novo;
  }
}