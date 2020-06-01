package repository.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import connection.ConnectionJDBC;
import model.DonoPet;
import model.Endereco;

public class DonoPetRepositoryJDBC {
	
	private final static String SQL_INSERE_DONOPET = "insert into donopet (nome, sobrenome, cpf, telefone, dataNascimento, endereco_id) values (?, ?, ?, ?, ?, ?)";
	private final static String SQL_BUSCAR_LIST_DONOPET = "select *, donopet.id as dpId, endereco.id as endId from donopet inner join endereco on endereco.id = donopet.endereco_id";
	private final static String SQL_ATUALIZAR_DONOPET = "update donopet set nome = ?, sobrenome = ?, cpf = ?, telefone = ?, dataNascimento = ?, endereco_id = ? where id = ?";
	private final static String SQL_DELETAR_DONOPET = "delete from donopet where id = ?";
	
	private static Connection conn = null;
	
	public static void inserirAdministrador(DonoPet donoPet) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_INSERE_DONOPET);
			stmt.setString(1, donoPet.getNome());
			stmt.setString(2, donoPet.getSobrenome());
			stmt.setString(3, donoPet.getCpf());
			stmt.setString(4, donoPet.getTelefone());
			stmt.setDate(5, (Date) donoPet.getDataNascimento());
			stmt.setInt(6, donoPet.getEndereco().getId());
			stmt.execute();
			
			stmt.close();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
	public static List<DonoPet> ListaAdministrador() throws SQLException{
		
		List<DonoPet> listDonoPet = null;
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_BUSCAR_LIST_DONOPET);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				DonoPet donoPet = new DonoPet();
				donoPet.setId(rs.getInt("admId"));
				donoPet.setNome(rs.getString("nome"));
				donoPet.setSobrenome(rs.getString("sobrenome"));
				donoPet.setCpf(rs.getString("cpf"));
				donoPet.setTelefone(rs.getString("telefone"));
				donoPet.setDataNascimento(rs.getDate("dataNascimento"));
				
				Endereco endereco = new Endereco();
				endereco.setId(rs.getInt("endId"));
				endereco.setEstado(rs.getString("estado"));
				endereco.setCidade(rs.getString("cidade"));
				endereco.setBairro(rs.getString("bairro"));
				endereco.setRua(rs.getString("rua"));
				endereco.setNumero(rs.getString("numero"));
				endereco.setComplemento(rs.getString("complemento"));
				
				donoPet.setEndereco(endereco);
				
				listDonoPet.add(donoPet);
			}
			
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
		return listDonoPet;
	}
	
	public static void atualizarAdministrador(DonoPet donoPet) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_ATUALIZAR_DONOPET);
			stmt.setString(1, donoPet.getNome());
			stmt.setString(2, donoPet.getSobrenome());
			stmt.setString(3, donoPet.getCpf());
			stmt.setString(4, donoPet.getTelefone());
			stmt.setDate(5, (Date) donoPet.getDataNascimento());
			stmt.setInt(6, donoPet.getEndereco().getId());
			
			stmt.setInt(7,  donoPet.getId());
			
			stmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
	public static void deletarAdministrador(DonoPet donoPet) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_DELETAR_DONOPET);
			stmt.setInt(1, donoPet.getId());
			stmt.execute();
			
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}

}
