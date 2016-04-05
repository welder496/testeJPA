package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ApplicationClienteProdutoWithExtraField {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("config");
	private static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (em != null) {
			
		} else {
			System.out.println("Não foi possível fazer conexão!!");
		}

	}

}
