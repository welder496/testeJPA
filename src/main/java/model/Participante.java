package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Participante {

	@Id
	@GeneratedValue
	private int codigo;
	
	private String nome;

	@OneToMany(mappedBy="participante", cascade= CascadeType.ALL, fetch=FetchType.LAZY)
	private List<GrupoParticipante> grupos = new ArrayList<GrupoParticipante>();
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<GrupoParticipante> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<GrupoParticipante> grupos) {
		this.grupos = grupos;
	}
	
}
