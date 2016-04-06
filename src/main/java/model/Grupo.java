package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Grupo {

	@Id
	@GeneratedValue
	private int codigo;

	private String descricao;
	
	@OneToMany(mappedBy="grupo", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private List<GrupoParticipante> participantes = new ArrayList<GrupoParticipante>();
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<GrupoParticipante> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<GrupoParticipante> participantes) {
		this.participantes = participantes;
	}
	
	public void addParticipante(Participante participante){
		Date today = new Date();
		
		GrupoParticipante gp = new GrupoParticipante();
		gp.setGrupo(this);
		gp.setParticipante(participante);
		gp.setParticipacao(today);
		this.getParticipantes().add(gp);
		participantes.add(gp);
	}
	
}
