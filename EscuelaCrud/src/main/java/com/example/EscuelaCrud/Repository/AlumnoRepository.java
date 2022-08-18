package com.example.EscuelaCrud.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.EscuelaCrud.Model.AlumnoModel;

public interface AlumnoRepository extends CrudRepository<AlumnoModel, Integer> {
    
}
