package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

	@OneToMany(targetEntity=Recurso.class, mappedBy="usuario", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Recurso> recursos = new ArrayList<Recurso>();
		
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Recurso> getRecursos() {
		return recursos;
	}

	public void addRecurso(Recurso recurso){
		recurso.setUsuario(this);
		recursos.add(recurso);
	}
	
}
