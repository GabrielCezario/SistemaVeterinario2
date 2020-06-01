package repository.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import connection.ConnectionJDBC;
import model.TipoAnimal;

public class TipoAnimalRepositoryJDBC {
	
	private final static String SQL_INSERE_TIPOANIMAL = "insert into tipoanimal (descricao) values (?)";
	private final static String SQL_BUSCAR_LIST_TIPOANIMAL = "select * from tipoanimal";
	private final static String SQL_ATUALIZAR_TIPOANIMAL = "update tipoanimal set descricao = ? where id = ?";
	private final static String SQL_DELETAR_TIPOANIMAL = "delete from tipoanimal where id = ?";
	
	private static Connection conn = null;

	public static void inserirTipoAnimal(TipoAnimal tipoAnimal) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_INSERE_TIPOANIMAL);
			stmt.setString(1, tipoAnimal.getDescricao());
			stmt.execute();
			
			stmt.close();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
	public static List<TipoAnimal> ListaTipoAnimal() throws SQLException{
		
		List<TipoAnimal> listTipoAnimal = null;
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_BUSCAR_LIST_TIPOANIMAL);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				TipoAnimal tipoAnimal = new TipoAnimal();
				tipoAnimal.setId(rs.getInt("id"));
				tipoAnimal.setDescricao(rs.getString("descricao"));
				
				listTipoAnimal.add(tipoAnimal);
			}
			
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
		return listTipoAnimal;
	}
	
	public static void atualizarTipoAnimal(TipoAnimal tipoAnimal) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_ATUALIZAR_TIPOANIMAL);
			stmt.setString(1, tipoAnimal.getDescricao());
			stmt.setInt(2, tipoAnimal.getId());
			
			stmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
	public static void deletarTipoAnimal(TipoAnimal tipoAnimal) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_DELETAR_TIPOANIMAL);
			stmt.setInt(1, tipoAnimal.getId());
			stmt.execute();
			
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}

}
