package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int codigo;
	
	private String nome;

	@ManyToMany
	@JoinTable(name="Compra",
			   joinColumns=@JoinColumn(name="cliente_id", referencedColumnName="codigo"),
			   inverseJoinColumns=@JoinColumn(name="produto_id", referencedColumnName="codigo"))
	private List<Produto> compras = new ArrayList<Produto>();
	
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
	
	public void addProduto(Produto produto){
		compras.add(produto);
	}
	
}
