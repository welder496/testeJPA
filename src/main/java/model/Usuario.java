package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int codigo;
	
	@Column(name = "nome")
	private String nome;
	
	@OneToMany(mappedBy="usuario")
	@JoinColumn(name="usuario_id")
	private List<Recurso> recurso;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Recurso> getRecurso() {
		return recurso;
	}

	public void setRecurso(List<Recurso> recurso) {
		this.recurso = recurso;
	}
	
}
