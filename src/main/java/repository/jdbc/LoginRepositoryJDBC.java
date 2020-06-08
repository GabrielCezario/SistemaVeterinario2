package repository.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import connection.ConnectionJDBC;
import model.Login;

public class LoginRepositoryJDBC {
	
	private final static String SQL_INSERE_LOGIN = "insert into login (login, senha) values (?,?)";
	private final static String SQL_BUSCAR_LIST_LOGIN = "select * from login";
	private final static String SQL_ATUALIZAR_LOGIN = "update login set login = ?, senha = ? where id = ?";
	private final static String SQL_DELETAR_LOGIN = "delete from login where id = ?";
	
	private static Connection conn = null;
	
	public void cadastrarLogin(Login login) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_INSERE_LOGIN);
			stmt.setString(1, login.getLogin());
			stmt.setString(2, login.getSenha());
			stmt.execute();
			stmt.close();
			
		} catch (Exception e) {
		} finally {
			conn.close();
		}
		
	}
	
	public List<Login> listarLogin() {
		
		List<Login> listLogin = null;
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_BUSCAR_LIST_LOGIN);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				Login login = new Login();
				login.setId(rs.getInt("id"));
				login.setLogin(rs.getNString("login"));
				login.setSenha(rs.getNString("senha"));
				
				listLogin.add(login);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
		return null;
	}
	
	public void atualizarLogin(Login login) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_ATUALIZAR_LOGIN);
			stmt.setString(1, login.getLogin());
			stmt.setString(2, login.getSenha());
			stmt.setLong(3, login.getId());
			stmt.execute();
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
	public void deletarLogin(Login login) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_DELETAR_LOGIN);
			stmt.setLong(1, login.getId());
			stmt.execute();
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
}
