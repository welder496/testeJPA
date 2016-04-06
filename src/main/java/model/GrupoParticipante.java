package model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@IdClass(GrupoParticipanteId.class)
public class GrupoParticipante {

	/**
	 * Aqui tem que colocar as instâncias de entidades
	 */
	@Id
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private Grupo grupo;

	/**
	 * Aqui tem que colocar as intâncias de entidades
	 */
	@Id
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private Participante participante;
	
	@Temporal(TemporalType.DATE)
	private Date participacao;


	public Date getParticipacao() {
		return participacao;
	}


	public void setParticipacao(Date participacao) {
		this.participacao = participacao;
	}


	public Participante getParticipante() {
		return participante;
	}


	public void setParticipante(Participante participante) {
		this.participante = participante;
	}


	public Grupo getGrupo() {
		return grupo;
	}


	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}	
	
	
}
