package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Funcionario;
import model.Projeto;

/**
 * Exemplo de associação N para N bidirecional entre duas entidades Projeto e Funcionários.
 * É gerada uma tabela de associação que não tem informações extras. Somente indica que um projeto pode
 * ter vários funcionários e, por outro lado, que vários funcionários podem estar em vários projetos.
 * @author welder
 *
 */

public class ApplicationProjetoFuncionario {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("config");
	private static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args) {
		if (em != null) {
			Funcionario func1 = new Funcionario();
			func1.setNome("Angela");
			
			Funcionario func2 = new Funcionario();
			func2.setNome("Marcia Azeredo e Silva");
			
			Projeto proj = new Projeto();
			proj.setDescricao("Projeto Um");
			proj.addFuncionario(func1);
			proj.addFuncionario(func2);
			
			em.getTransaction().begin();
			em.persist(func1);
			em.persist(func2);
			em.persist(proj);
			em.getTransaction().commit();
		} else {
			System.out.println("Não foi possível realizar a conexão!!");
		}

	}

}
