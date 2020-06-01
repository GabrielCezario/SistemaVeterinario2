package repository.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import connection.ConnectionJDBC;
import model.Administrador;
import model.Endereco;

public class AdministradorRepositoryJDBC {
	
	private final static String SQL_INSERE_ADMINISTRADOR = "insert into administrador (nome, sobrenome, cpf, telefone, dataNascimento, endereco_id) values (?, ?, ?, ?, ?, ?)";
	private final static String SQL_BUSCAR_LIST_ADMINISTRADOR = "select *, administrador.id as admId, endereco.id as endId from administrador inner join endereco on endereco.id = administrador.endereco_id";
	private final static String SQL_ATUALIZAR_ADMINISTRADOR = "update administrador set nome = ?, sobrenome = ?, cpf = ?, telefone = ?, dataNascimento = ?, endereco_id = ? where id = ?";
	private final static String SQL_DELETAR_ADMINISTRADOR = "delete from administrador where id = ?";
	
	private static Connection conn = null;

	public static void inserirAdministrador(Administrador administrador) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_INSERE_ADMINISTRADOR);
			stmt.setString(1, administrador.getNome());
			stmt.setString(2, administrador.getSobrenome());
			stmt.setString(3, administrador.getCpf());
			stmt.setString(4, administrador.getTelefone());
			stmt.setDate(5, (Date) administrador.getDataNascimento());
			stmt.setInt(6, administrador.getEndereco().getId());
			stmt.execute();
			
			stmt.close();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
	public static List<Administrador> ListaAdministrador() throws SQLException{
		
		List<Administrador> listAdministrador = null;
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_BUSCAR_LIST_ADMINISTRADOR);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Administrador adm = new Administrador();
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
				
				listAdministrador.add(adm);
			}
			
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
		return listAdministrador;
	}
	
	public static void atualizarAdministrador(Administrador administrador) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_ATUALIZAR_ADMINISTRADOR);
			stmt.setString(1, administrador.getNome());
			stmt.setString(2, administrador.getSobrenome());
			stmt.setString(3, administrador.getCpf());
			stmt.setString(4, administrador.getTelefone());
			stmt.setDate(5, (Date) administrador.getDataNascimento());
			stmt.setInt(6, administrador.getEndereco().getId());
			
			stmt.setInt(7,  administrador.getId());
			
			stmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
	public static void deletarAdministrador(Administrador administrador) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_DELETAR_ADMINISTRADOR);
			stmt.setInt(1, administrador.getId());
			stmt.execute();
			
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
	
}
