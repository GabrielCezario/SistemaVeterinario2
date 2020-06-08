package repository.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import connection.ConnectionJDBC;
import model.Pet;

public class PetRepositoryJDBC {
	
	private final static String SQL_INSERE_PET = "insert into pet (nome, dataNascimento, peso, cod_tipo, cod_dono) values (?, ?, ?, ?, ?)";
	private final static String SQL_BUSCAR_LIST_PET = "select *from pet";
	private final static String SQL_ATUALIZAR_PET = "update pet set nome = ?, dataNascimento = ?, peso = ?, cod_tipo = ?, cod_dono = ? where id = ?";
	private final static String SQL_DELETAR_PET = "delete from pet where id = ?";
	
	private static Connection conn = null;
	
	public void cadastrarPet(Pet pet) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_INSERE_PET);
			stmt.setString(1, pet.getNome());
			stmt.setDate(2, (Date) pet.getDataNascimento());
			stmt.setLong(3, (long) pet.getPeso());
			stmt.setLong(4, pet.getTipoAnimal().getId());
			stmt.setInt(5, pet.getDonoPet().getId());
			stmt.execute();
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}
	
	public List<Pet> listarPet() throws SQLException {
		
		List<Pet> listPet = null;
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_BUSCAR_LIST_PET);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				Pet pet = new Pet();
				pet.setNome(rs.getString("nome"));
				pet.setPeso(rs.getDouble("peso"));
				
				listPet.add(pet);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
		
		return listPet;
	}

	public void atualizarPet(Pet pet) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_ATUALIZAR_PET);
			stmt.setString(1, pet.getNome());
			stmt.setDate(2, (Date) pet.getDataNascimento());
			stmt.setLong(3, (long) pet.getPeso());
			stmt.setLong(4, pet.getTipoAnimal().getId());
			stmt.setInt(5, pet.getDonoPet().getId());
			
			stmt.setInt(6, pet.getId());
			
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
	
	}

	public void deletarPet(Pet pet) throws SQLException {
		
		conn = ConnectionJDBC.getConnection();
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(SQL_DELETAR_PET);
			stmt.setInt(1, pet.getId());
			stmt.execute();
			
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
	
	}
	
	

}
