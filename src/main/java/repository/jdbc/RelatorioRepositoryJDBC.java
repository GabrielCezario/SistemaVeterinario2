package repository.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import connection.ConnectionJDBC;
import model.Relatorio;

public class RelatorioRepositoryJDBC {

	private final static String SQL_INSERE_RELATORIO = "insert into relatorio (titulo, descricao) values (?, ?)";
	private final static String SQL_BUSCAR_LIST_RELATORIO = "select * from relatorio";
	private final static String SQL_ATUALIZAR_RELATORIO = "update relatorio set titulo = ?, descricao = ? where id = ?";
	private final static String SQL_DELETAR_RELATORIO = "delete from relatorio where id = ?";

	private static Connection conn = null;

	public void cadastrarRelatorio(Relatorio relatorio) throws SQLException {

		conn = ConnectionJDBC.getConnection();

		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_INSERE_RELATORIO);
			stmt.setString(1, relatorio.getTitulo());
			stmt.setString(2, relatorio.getDescricao());
			stmt.execute();
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}

	}

	public List<Relatorio> listarRelatorio() throws SQLException {

		List<Relatorio> listRelatorio = null;
		conn = ConnectionJDBC.getConnection();

		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_BUSCAR_LIST_RELATORIO);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Relatorio relatorio = new Relatorio();
				relatorio.setId(rs.getInt("id"));
				relatorio.setTitulo(rs.getString("titulo"));
				relatorio.setDescricao(rs.getString("descricao"));
				
				listRelatorio.add(relatorio);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
		return listRelatorio;
	}

	public void atualizarRelatorio(Relatorio relatorio) throws SQLException {

		conn = ConnectionJDBC.getConnection();

		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_INSERE_RELATORIO);
			stmt.setString(1, relatorio.getTitulo());
			stmt.setString(2, relatorio.getDescricao());
			stmt.setInt(3, relatorio.getId());
			stmt.execute();
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}

	public void deletarRelatorio(Relatorio relatorio) throws SQLException {

		conn = ConnectionJDBC.getConnection();

		try {

			PreparedStatement stmt = conn.prepareStatement(SQL_DELETAR_RELATORIO);
			stmt.setInt(1, relatorio.getId());
			stmt.execute();

			stmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}

	}

}
