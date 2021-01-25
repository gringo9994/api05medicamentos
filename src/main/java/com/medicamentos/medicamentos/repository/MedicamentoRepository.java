package com.medicamentos.medicamentos.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.medicamentos.medicamentos.controller.MedicamentoController;
import com.medicamentos.medicamentos.models.Fabricante;
import com.medicamentos.medicamentos.models.Medicamento;

@Repository
@Transactional
public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {

	
	// USANDO JPQL
	
// busca um medicamento pelo nome 

	//@Query("select pfrom Medicamento p where p.nome like %?1%")
	//List<Medicamento> findMedicamentoByName(String nome);



	

}
