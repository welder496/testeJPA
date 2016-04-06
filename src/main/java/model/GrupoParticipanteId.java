package model;

import java.io.Serializable;

public class GrupoParticipanteId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Na IdClass (aqui) deve-se colocar um tipo primitivo....
	 * Este tipo referencia a chave primária das entidades ou tabelas pais
	 * Neste caso int grupo referencia a entidade Grupo;
	 * int participante a entidade Participante;
	 * Esta configuração é obrigatória para o relacionamento funcionar
	 */
	
	private int grupo;
	
	private int participante;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + grupo;
		result = prime * result + participante;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GrupoParticipanteId other = (GrupoParticipanteId) obj;
		if (grupo != other.grupo)
			return false;
		if (participante != other.participante)
			return false;
		return true;
	}


	
}
