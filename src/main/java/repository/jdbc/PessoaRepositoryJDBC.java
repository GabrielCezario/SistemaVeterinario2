package repository.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import connection.ConnectionJDBC;
import model.Pessoa;
import model.Endereco;

public class PessoaRepositoryJDBC {
	
	private final static String SQL_INSERE_PESSOA = "insert into pessoa (nome, sobrenome, cpf, telefone, dataNascimento, endereco_id) values (?, ?, ?, ?, ?, ?)";
	private final static String SQL_BUSCAR_LIST_PESSOA = "select *, pessoa.id as pId, endereco.id as endId from pessoa inner join endereco on endereco.id = pessoa.endereco_id";
	private final static String SQL_ATUALIZAR_PESSOA = "update pessoa set nome = ?, sobrenome = ?, cpf = ?, telefone = ?, dataNascimento = ?, endereco_id = ? where id = ?";
	private final static String SQL_DELETAR_PESSOA = "delete from pessoa where id = ?";
	
	private static Connection conn = null;

	public static void inserirPessoa(Pessoa pessoa) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_INSERE_PESSOA);
			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, pessoa.getSobrenome());
			stmt.setString(3, pessoa.getCpf());
			stmt.setString(4, pessoa.getTelefone());
			stmt.setDate(5, (Date) pessoa.getDataNascimento());
			stmt.setInt(6, pessoa.getEndereco().getId());
			stmt.execute();
			
			stmt.close();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
	public static List<Pessoa> ListaPessoa() throws SQLException{
		
		List<Pessoa> listPessoa = null;
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_BUSCAR_LIST_PESSOA);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Pessoa pessoa = new Pessoa();
				pessoa.setId(rs.getInt("pId"));
				pessoa.setNome(rs.getString("nome"));
				pessoa.setSobrenome(rs.getString("sobrenome"));
				pessoa.setCpf(rs.getString("cpf"));
				pessoa.setTelefone(rs.getString("telefone"));
				pessoa.setDataNascimento(rs.getDate("dataNascimento"));
				
				Endereco endereco = new Endereco();
				endereco.setId(rs.getInt("endId"));
				endereco.setEstado(rs.getString("estado"));
				endereco.setCidade(rs.getString("cidade"));
				endereco.setBairro(rs.getString("bairro"));
				endereco.setRua(rs.getString("rua"));
				endereco.setNumero(rs.getString("numero"));
				endereco.setComplemento(rs.getString("complemento"));
				
				pessoa.setEndereco(endereco);
				
				listPessoa.add(pessoa);
			}
			
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
		return listPessoa;
	}
	
	public static void atualizarPessoa(Pessoa pessoa) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_ATUALIZAR_PESSOA);
			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, pessoa.getSobrenome());
			stmt.setString(3, pessoa.getCpf());
			stmt.setString(4, pessoa.getTelefone());
			stmt.setDate(5, (Date) pessoa.getDataNascimento());
			stmt.setInt(6, pessoa.getEndereco().getId());
			
			stmt.setInt(7,  pessoa.getId());
			
			stmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
	public static void deletarPessoa(Pessoa pessoa) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_DELETAR_PESSOA);
			stmt.setInt(1, pessoa.getId());
			stmt.execute();
			
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}

}
