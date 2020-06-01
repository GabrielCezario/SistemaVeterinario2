package repository.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import connection.ConnectionJDBC;
import model.Endereco;

public class EnderecoRepositoryJDBC {
	
	private final static String SQL_INSERE_ENDERECO = "insert into endereco (estado, cidade, bairro, rua, numero, complemento) values (?, ?, ?, ?, ?, ?)";
	private final static String SQL_BUSCAR_LIST_ENDERECO = "select * from endereco";
	private final static String SQL_ATUALIZAR_ENDERECO = "update endereco set estado = ?, cidade = ?, bairo = ?, rua = ?, numero = ?, complemento = ? where id = ?";
	private final static String SQL_DELETAR_ENDERECO = "delete from endereco where id = ?";
	
	private static Connection conn = null;

	public static void inserirEndereco(Endereco endereco) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_INSERE_ENDERECO);
			stmt.setString(1, endereco.getEstado());
			stmt.setString(2, endereco.getCidade());
			stmt.setString(3, endereco.getBairro());
			stmt.setString(4, endereco.getRua());
			stmt.setString(5, endereco.getNumero());
			stmt.setString(6, endereco.getComplemento());
			stmt.execute();
			
			stmt.close();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
	public static List<Endereco> ListaEndereco() throws SQLException{
		
		List<Endereco> listEndereco = null;
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_BUSCAR_LIST_ENDERECO);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {				
				Endereco endereco = new Endereco();
				endereco.setId(rs.getInt("id"));
				endereco.setEstado(rs.getString("estado"));
				endereco.setCidade(rs.getString("cidade"));
				endereco.setBairro(rs.getString("bairro"));
				endereco.setRua(rs.getString("rua"));
				endereco.setNumero(rs.getString("numero"));
				endereco.setComplemento(rs.getString("complemento"));
				
				listEndereco.add(endereco);
			}
			
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
		return listEndereco;
	}
	
	public static void atualizarEndereco(Endereco endereco) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_ATUALIZAR_ENDERECO);
			stmt.setString(1, endereco.getEstado());
			stmt.setString(2, endereco.getCidade());
			stmt.setString(3, endereco.getBairro());
			stmt.setString(4, endereco.getRua());
			stmt.setString(5, endereco.getNumero());
			stmt.setString(6, endereco.getComplemento());
			
			stmt.setInt(7,  endereco.getId());
			
			stmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
	public static void deletarEndereco(Endereco endereco) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_DELETAR_ENDERECO);
			stmt.setInt(1, endereco.getId());
			stmt.execute();
			
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}

}
