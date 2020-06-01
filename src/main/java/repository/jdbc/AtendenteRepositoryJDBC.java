package repository.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import connection.ConnectionJDBC;
import model.Atendente;
import model.Endereco;

public class AtendenteRepositoryJDBC {
	
	private final static String SQL_INSERE_ATENDENTE = "insert into atendente (nome, sobrenome, cpf, telefone, dataNascimento, endereco_id) values (?, ?, ?, ?, ?, ?)";
	private final static String SQL_BUSCAR_LIST_ATENDENTE = "select *, atendente.id as atId, endereco.id as endId from atendente inner join endereco on endereco.id = atendente.endereco_id";
	private final static String SQL_ATUALIZAR_ATENDENTE = "update atendente set nome = ?, sobrenome = ?, cpf = ?, telefone = ?, dataNascimento = ?, endereco_id = ? where id = ?";
	private final static String SQL_DELETAR_ATENDENTE = "delete from atendente where id = ?";
	
	private static Connection conn = null;

	public static void inserirAtendente(Atendente atendente) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_INSERE_ATENDENTE);
			stmt.setString(1, atendente.getNome());
			stmt.setString(2, atendente.getSobrenome());
			stmt.setString(3, atendente.getCpf());
			stmt.setString(4, atendente.getTelefone());
			stmt.setDate(5, (Date) atendente.getDataNascimento());
			stmt.setInt(6, atendente.getEndereco().getId());
			stmt.execute();
			
			stmt.close();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
	public static List<Atendente> ListaAtendente() throws SQLException{
		
		List<Atendente> listAtendente = null;
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_BUSCAR_LIST_ATENDENTE);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Atendente atendente = new Atendente();
				atendente.setId(rs.getInt("atId"));
				atendente.setNome(rs.getString("nome"));
				atendente.setSobrenome(rs.getString("sobrenome"));
				atendente.setCpf(rs.getString("cpf"));
				atendente.setTelefone(rs.getString("telefone"));
				atendente.setDataNascimento(rs.getDate("dataNascimento"));
				
				Endereco endereco = new Endereco();
				endereco.setId(rs.getInt("endId"));
				endereco.setEstado(rs.getString("estado"));
				endereco.setCidade(rs.getString("cidade"));
				endereco.setBairro(rs.getString("bairro"));
				endereco.setRua(rs.getString("rua"));
				endereco.setNumero(rs.getString("numero"));
				endereco.setComplemento(rs.getString("complemento"));
				
				atendente.setEndereco(endereco);
				
				listAtendente.add(atendente);
			}
			
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
		return listAtendente;
	}
	
	public static void atualizarAtendente(Atendente atendente) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_ATUALIZAR_ATENDENTE);
			stmt.setString(1, atendente.getNome());
			stmt.setString(2, atendente.getSobrenome());
			stmt.setString(3, atendente.getCpf());
			stmt.setString(4, atendente.getTelefone());
			stmt.setDate(5, (Date) atendente.getDataNascimento());
			stmt.setInt(6, atendente.getEndereco().getId());
			
			stmt.setInt(7,  atendente.getId());
			
			stmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
	public static void deletarAtendente(Atendente atendente) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_DELETAR_ATENDENTE);
			stmt.setInt(1, atendente.getId());
			stmt.execute();
			
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}

}
