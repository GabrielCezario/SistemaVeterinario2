package repository.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import connection.ConnectionJDBC;
import model.FichaMedica;
import model.Pet;

public class FichaMedicaRepositoryJDBC {

	private final static String SQL_INSERE_FICHAMEDICA = "insert into FichaMedica (diagnostico, pet_id) values (?,?)";
	private final static String SQL_BUSCAR_LIST_FICHAMEDICA = "select * fichamedica.id as fichaId, pet.id as petId from fichamedica inner join pet on pet.id = fichamedica.Pet_id";
	private final static String SQL_ATUALIZAR_FICHAMEDICA = "update fichamedica set diagnostico = ?, pet_id = ? where id = ?";
	private final static String SQL_DELETAR_FICHAMEDICA = "delete from FichaMedica where id = ?";

	private static Connection conn = null;

	public void cadastrarFichaMedica(FichaMedica fichaMedica) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_INSERE_FICHAMEDICA);
			stmt.setString(1, fichaMedica.getDiagnostico());
			stmt.setInt(2, fichaMedica.getPet().getId());
			stmt.execute();
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}

	}

	public List<FichaMedica> listarFichasMedicas() throws SQLException {
		
		List<FichaMedica> listaFichaMedica = null;
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_BUSCAR_LIST_FICHAMEDICA);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				FichaMedica fichaMedica = new FichaMedica();
				fichaMedica.setId(rs.getInt("fichaId"));
				fichaMedica.setDiagnostico(rs.getString("diagnostico"));
				
				Pet pet = new Pet();
				pet.setNome(rs.getString("nome"));
				pet.setPeso(rs.getDouble("peso"));
				
				fichaMedica.setPet(pet);
				listaFichaMedica.add(fichaMedica);				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
		return listaFichaMedica;
	}

	public void atualizarFichaMedica(FichaMedica fichaMedica) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_ATUALIZAR_FICHAMEDICA);
			stmt.setString(1, fichaMedica.getDiagnostico());
			stmt.setInt(2, fichaMedica.getPet().getId());
			stmt.setInt(3, fichaMedica.getId());
			stmt.execute();
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}

	}

	public void deletarFichaMedica(FichaMedica fichaMedica) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_DELETAR_FICHAMEDICA);
			stmt.setInt(1, fichaMedica.getId());
			stmt.execute();
			
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}

	}

}
