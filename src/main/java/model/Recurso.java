package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Recurso implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int codigo;
	
	@Column(name="recurso")
	private String recurso;
	
	private Usuario usuario;
	
	public String getRecurso() {
		return recurso;
	}

	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
