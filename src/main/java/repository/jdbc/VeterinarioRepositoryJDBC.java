package repository.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import connection.ConnectionJDBC;
import model.Endereco;
import model.Veterinario;

public class VeterinarioRepositoryJDBC {
	
	private final static String SQL_INSERE_ADMINISTRADOR = "insert into veterinario (nome, sobrenome, cpf, telefone, dataNascimento, endereco_id) values (?, ?, ?, ?, ?, ?)";
	private final static String SQL_BUSCAR_LIST_ADMINISTRADOR = "select *, veterinario.id as admId, endereco.id as endId from veterinario inner join endereco on endereco.id = veterinario.endereco_id";
	private final static String SQL_ATUALIZAR_ADMINISTRADOR = "update veterinario set nome = ?, sobrenome = ?, cpf = ?, telefone = ?, dataNascimento = ?, endereco_id = ? where id = ?";
	private final static String SQL_DELETAR_ADMINISTRADOR = "delete from veterinario where id = ?";
	
	private static Connection conn = null;

	public static void inserirVeterinario(Veterinario veterinario) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_INSERE_ADMINISTRADOR);
			stmt.setString(1, veterinario.getNome());
			stmt.setString(2, veterinario.getSobrenome());
			stmt.setString(3, veterinario.getCpf());
			stmt.setString(4, veterinario.getTelefone());
			//stmt.setDate(5, (Date) veterinario.getDataNascimento());
			stmt.setInt(6, veterinario.getEndereco().getId());
			stmt.execute();
			
			stmt.close();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
	public static List<Veterinario> ListaVeterinario() throws SQLException{
		
		List<Veterinario> listVeterinario = null;
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_BUSCAR_LIST_ADMINISTRADOR);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Veterinario adm = new Veterinario();
				adm.setId(rs.getInt("admId"));
				adm.setNome(rs.getString("nome"));
				adm.setSobrenome(rs.getString("sobrenome"));
				adm.setCpf(rs.getString("cpf"));
				adm.setTelefone(rs.getString("telefone"));
				adm.setDataNascimento(rs.getDate("dataNascimento"));
				
				Endereco endereco = new Endereco();
				endereco.setId(rs.getInt("endId"));
				endereco.setEstado(rs.getString("estado"));
				endereco.setCidade(rs.getString("cidade"));
				endereco.setBairro(rs.getString("bairro"));
				endereco.setRua(rs.getString("rua"));
				endereco.setNumero(rs.getString("numero"));
				endereco.setComplemento(rs.getString("complemento"));
				
				adm.setEndereco(endereco);
				
				listVeterinario.add(adm);
			}
			
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
		return listVeterinario;
	}
	
	public static void atualizarVeterinario(Veterinario veterinario) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_ATUALIZAR_ADMINISTRADOR);
			stmt.setString(1, veterinario.getNome());
			stmt.setString(2, veterinario.getSobrenome());
			stmt.setString(3, veterinario.getCpf());
			stmt.setString(4, veterinario.getTelefone());
			//stmt.setByte(5, (Date) veterinario.getDataNascimento());
			stmt.setInt(6, veterinario.getEndereco().getId());
			
			stmt.setInt(7,  veterinario.getId());
			
			stmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
	public static void deletarVeterinario(Veterinario veterinario) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_DELETAR_ADMINISTRADOR);
			stmt.setInt(1, veterinario.getId());
			stmt.execute();
			
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}

}
