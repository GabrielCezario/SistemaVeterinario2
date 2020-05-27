package connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionJPA {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinarioPU");
	
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

}
