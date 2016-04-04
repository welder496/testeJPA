package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Recurso;
import model.Usuario;

public class Application {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("config");
	private static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (em != null) {
			Usuario usr = new Usuario();
			em.getTransaction().begin();		
			usr.setNome("Welder Maurício de Souza");
			
			Recurso r1 = new Recurso();
			r1.setRecurso("home/welder/teste");
			usr.addRecurso(r1);
			
			Recurso r2 = new Recurso();
			r2.setRecurso("home/welder/app");
			usr.addRecurso(r2);

			Recurso r3 = new Recurso();
			r3.setRecurso("home/welder/app");
			usr.addRecurso(r3);
			
			em.persist(usr);		
			em.getTransaction().commit(); 
		} else {
			System.out.println("Não foi possível fazer conexão!!");
		}		
		em.close();
		emf.close();
		
	}

}
