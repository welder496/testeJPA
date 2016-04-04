package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Application {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("config");
	private static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (em != null) {
		/*	Usuario usr = new Usuario();
			usr.setNome("Welder Maurício de Souza");
			em.getTransaction().begin();
			em.persist(usr);
			em.getTransaction().commit(); */
		} else {
			System.out.println("Não foi possível fazer conexão!!");
		}		
		em.close();
		emf.close();
		
	}

}
