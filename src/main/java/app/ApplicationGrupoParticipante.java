package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Grupo;
import model.Participante;

public class ApplicationGrupoParticipante {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("config");
	private static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (em != null) {
			Participante p1 = new Participante();
			p1.setNome("Alessandra");
			Participante p2 = new Participante();
			p2.setNome("Marcia");
			Grupo gp = new Grupo();
			gp.setDescricao("Condôminos Bougainville");
			gp.addParticipante(p1);
			gp.addParticipante(p2);
			
			em.getTransaction().begin();
			em.persist(p1);
			em.persist(p2);
			em.persist(gp);
			em.getTransaction().commit();
			
		} else {
			System.out.println("Não foi possível fazer a conexão!!");
		}

	}

}
