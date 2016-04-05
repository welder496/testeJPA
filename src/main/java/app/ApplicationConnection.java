package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Exemplo de conexão de banco configurando em persistence.xml 
 * Config é o persistence unit usado para fazer esta configuração. Localiza-se em persistence.xml.
 * @author welder
 *
 */

public class ApplicationConnection {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("config");
	private static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (em != null) {
			System.out.println("Conexão realizada com sucesso!!");
		} else {
			System.out.println("Não foi possível fazer conexão!!");
		}		
		em.close();
		emf.close();
		
	}

}
