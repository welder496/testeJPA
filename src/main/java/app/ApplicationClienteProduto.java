package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Cliente;
import model.Produto;

/**
 * Exemplo de associação N-N com classe de associação. A associação ocorre entre as entidades
 * Cliente e Produto, gerando a entidade de associação Compra.
 * @author welder
 *
 */

public class ApplicationClienteProduto {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("config");
	private static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (em != null) {
			Cliente clie = new Cliente();
			clie.setNome("Carlos");
			
			Produto prod1 = new Produto();
			prod1.setDescricao("Batata");
			
			Produto prod2 = new Produto();
			prod2.setDescricao("Arroz");
			
			clie.addProduto(prod1);
			clie.addProduto(prod2);
			
			em.getTransaction().begin();
			em.persist(prod1);
			em.persist(prod2);
			em.persist(clie);
			em.getTransaction().commit();
			
		} else {
			System.out.println("Não foi possível fazer conexão!!");
		}

	}

}
