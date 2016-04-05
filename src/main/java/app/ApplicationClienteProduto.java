package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
			
		} else {
			System.out.println("Não foi possível fazer conexão!!");
		}

	}

}
