package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Projeto {

	@Id
	@GeneratedValue
	private int codigo;
	
	private String descricao;
	
	@ManyToMany(targetEntity= Funcionario.class)
	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

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

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public void addFuncionario(Funcionario funcionario){
		funcionarios.add(funcionario);
	}
	
}
