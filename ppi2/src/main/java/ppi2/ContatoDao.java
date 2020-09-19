package ppi2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContatoDao {

    // a conexão com o banco de dados
    private Connection connection;

    public ContatoDao() {
      new ConnectionFactory();
	this.connection = ConnectionFactory.getconnection();
	
    }
    
    public void adiciona(Cadastro cadastro) {
        String sql = "insert into usuarios " +
                "(Nome,Email,Senha)" +
                "values (?,?,?)";

        try {
            // prepared statement para inserção
        	
            PreparedStatement stmt = connection.prepareStatement(sql);

            // seta os valores
            stmt.setString(1,cadastro.getNome());
            stmt.setString(2,cadastro.getEmail());
            stmt.setString(3,cadastro.getSenha());

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public void pesquisa (Cadastro cadastro) throws SQLException {
    	new ConnectionFactory();
		Connection con = ConnectionFactory.getconnection();
    	PreparedStatement stmt = con.prepareStatement("select nome, email from usuarios");
    	
    	ResultSet rs = stmt.executeQuery();
    	
    	while(rs.next()) {
    		String nome = rs.getString("nome");
    		String email = rs.getString("email");
    		
    		System.out.println(nome + " :: "+ email);
    	}
    	stmt.close();
    	con.close();
    	
    }
    
    public void altera (Cadastro cadastro) throws SQLException {
    	new ConnectionFactory();
		Connection con = ConnectionFactory.getconnection();
    	PreparedStatement stmt = con.prepareStatement("update usuarios set nome=?, email=?, senha=? where id=1");
    	
    	ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
            stmt.setString(1,cadastro.getNome());
            stmt.setString(2,cadastro.getEmail());
            stmt.setString(3,cadastro.getSenha());
    		stmt.execute();
    		stmt.close();
    	}
    }
    
    
    
    
    public boolean remove(Cadastro cadastro) throws SQLException {
    	String sql = "DELETE FROM usuarios where id = 1";
		
    	PreparedStatement stmt = connection.prepareStatement(sql);
		
		stmt.setLong(1, cadastro.getId());
		
		boolean rowDeleted = stmt.executeUpdate() > 0;
        stmt.execute();
        stmt.close();
		
		return rowDeleted;	
    }
    
  
    
  }