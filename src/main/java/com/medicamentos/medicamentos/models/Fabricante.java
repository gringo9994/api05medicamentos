package com.medicamentos.medicamentos.models;



import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
public class Fabricante  implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonInclude(Include.NON_NULL)
	
	
	private Long id;
	@JsonInclude(Include.NON_NULL)
	 
	private String nome;
	

	@JsonInclude(Include.NON_NULL)
	 
	private String telefone;
	

	// contrutor vazio
	
	  // um fabricante ,pode ter vários medicamentos
	
	 //@OneToOne(cascade = CascadeType.ALL)
	 
	
	// @JsonInclude(Include.NON_NULL)
	 
	
	 
  // private Medicamento medicamento;
	
	
	
	
	
	
	public Fabricante() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

















	public static long getSerialversionuid() {
		return serialVersionUID;
	}

























	



	



	
















	
	
	
	
	
	
	

}

