


package com.medicamentos.medicamentos.models;

import java.io.Serializable;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
public class Reacoes  implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@JsonInclude(Include.NON_NULL)
	
	private Long id;
	@JsonInclude(Include.NON_NULL)
	 
	private String descricao;
	 
	
	
	//muitas reacoes para um medicamento
	// @JsonInclude(Include.NON_NULL)
	// @ManyToOne(cascade =CascadeType.ALL)
	  

 //private Medicamento medicamento;
 
    
   

    

	 

	
	
	
	public Reacoes() {
		
		
		
	}
	
	
	
	
	
	
	
	



	public Reacoes(Long id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}











	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}











	










	public static long getSerialversionuid() {
		return serialVersionUID;
	}











	











	





	
	
	
	
	
	

}
