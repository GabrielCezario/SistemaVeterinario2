package repository.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import connection.ConnectionJDBC;
import model.TipoEspecialidade;;

public class TipoEspecialidadeRepositoryJDBC {
	
	private final static String SQL_INSERE_TIPOESPECIALIDADE = "insert into tipoespecialidade (descricao) values (?)";
	private final static String SQL_BUSCAR_LIST_TIPOESPECIALIDADE = "select * from tipoespecialidade";
	private final static String SQL_ATUALIZAR_TIPOESPECIALIDADE = "update tipoespecialidade set descricao = ? where id = ?";
	private final static String SQL_DELETAR_TIPOESPECIALIDADE = "delete from tipoespecialidade where id = ?";
	
	private static Connection conn = null;

	public static void inserirTipoAnimal(TipoEspecialidade tipoEspecialidade) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_INSERE_TIPOESPECIALIDADE);
			stmt.setString(1, tipoEspecialidade.getDescricao());
			stmt.execute();
			
			stmt.close();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
	public static List<TipoEspecialidade> ListaTipoAnimal() throws SQLException{
		
		List<TipoEspecialidade> listTipoEspecialidade = null;
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_BUSCAR_LIST_TIPOESPECIALIDADE);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				TipoEspecialidade tipoEspecialidade = new TipoEspecialidade();
				tipoEspecialidade.setId(rs.getInt("id"));
				tipoEspecialidade.setDescricao(rs.getString("descricao"));
				
				listTipoEspecialidade.add(tipoEspecialidade);
			}
			
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
		return listTipoEspecialidade;
	}
	
	public static void atualizarTipoAnimal(TipoEspecialidade tipoEspecialidade) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_ATUALIZAR_TIPOESPECIALIDADE);
			stmt.setString(1, tipoEspecialidade.getDescricao());
			stmt.setInt(2, tipoEspecialidade.getId());
			
			stmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
	public static void deletarTipoAnimal(TipoEspecialidade tipoEspecialidade) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_DELETAR_TIPOESPECIALIDADE);
			stmt.setInt(1, tipoEspecialidade.getId());
			stmt.execute();
			
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}

}
