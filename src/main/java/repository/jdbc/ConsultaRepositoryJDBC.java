package repository.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import connection.ConnectionJDBC;
import model.Consulta;
import model.Pet;
import model.Veterinario;

public class ConsultaRepositoryJDBC {
	
	private static final String SQL_INSERE_CONSULTA = "insert into consulta (pet_id, veterinario_id, dataConsulta, descricaoConsulta) values (?,?,?,?)";
	private static final String SQL_LISTA_CONSULTA = "select * from consulta";
	private static final String SQL_ALTERA_CONSULTA = "update consulta set pet_id = ?, veterinario_id = ?, dataConsulta = ?, descricaoConsulta = ?";
	private static final String SQL_ATUALIZA_CONSULTA = "delete from consulta where id = ?";
	
	private static Connection conn = null;
	
	public void inserirConsulta(Consulta consulta) throws SQLException {
	
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_INSERE_CONSULTA);
			stmt.setInt(1, consulta.getPet().getId());
			stmt.setInt(2, consulta.getVeterinario().getId());
			stmt.setDate(3, (Date) consulta.getDataConsulta());
			stmt.setString(4, consulta.getDescricaoConsulta());
			stmt.execute();
			stmt.close();			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
			
	}
	
	public List<Consulta> listarConsultas() throws SQLException{
		
		List<Consulta> listConsulta = null;
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_LISTA_CONSULTA);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Consulta consulta = new Consulta();
				consulta.setPet((Pet) rs.getObject("pet_id"));
				consulta.setVeterinario((Veterinario) rs.getObject("veterinario_id"));
				consulta.setPet((Pet) rs.getObject("pet_id"));
				consulta.setPet((Pet) rs.getObject("pet_id"));
				
				listConsulta.add(consulta);
			}
			
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
		return listConsulta;
	}
	
	public void atualizarConsulta(Consulta consulta) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_ALTERA_CONSULTA);
			stmt.setInt(1, consulta.getPet().getId());
			stmt.setInt(2, consulta.getVeterinario().getId());
			stmt.setDate(3, (Date) consulta.getDataConsulta());
			stmt.setString(4, consulta.getDescricaoConsulta());
			stmt.execute();
			stmt.close();			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
	public void deletarConsulta(Consulta consulta) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_ATUALIZA_CONSULTA);
			stmt.setInt(1, consulta.getId());
			stmt.execute();
			
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}

}
