package org.example.activity3_partie1_hopital_thylemeaf.repository;

import org.example.activity3_partie1_hopital_thylemeaf.entities.patient;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PatientRepository extends JpaRepository<patient,Long> {
Page<patient> findByNomContaining(String keyword, Pageable pageable );

@Query("select p from patient p where p.nom like :x")
    Page<patient> chercher(@Param("x") String keyword,Pageable pageable);


}

