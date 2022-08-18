package com.example.EscuelaCrud.Service;

import java.util.List;

import com.example.EscuelaCrud.Model.AlumnoModel;

public interface AlumnoService {

    public List<AlumnoModel> findAll(); 

    public AlumnoModel save(AlumnoModel alumno);

    public AlumnoModel findById(Integer id);

    public void delete(Integer id);
}
