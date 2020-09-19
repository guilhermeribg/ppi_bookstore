package ppi2;
import java.sql.SQLException;

public class Manipulando {
	
	public static void main(String[] args) throws SQLException {
		 // pronto para gravar
		  Cadastro cadastro = new Cadastro();
		  cadastro.setNome("Isabela");
		  cadastro.setEmail("belchaveiro_oi@hotmail.com");
		  cadastro.setSenha("afarm");
		  
		  Cadastro cadastro2 = new Cadastro();
		  cadastro2.setNome("Agnes");
		  cadastro2.setEmail("agnesmaria@hotmail.com");
		  cadastro2.setSenha("amora");
		  // grave nessa conexão!!!
		  ContatoDao dao = new ContatoDao();

		  // método elegante
		  //dao.altera(cadastro2);
		  //dao.remove(cadastro);
		  dao.adiciona(cadastro);
		  dao.adiciona(cadastro2);
		  dao.pesquisa(cadastro);
		  

		  		  
		  
	}
}
