package com.example.EscuelaCrud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.EscuelaCrud.Model.AlumnoModel;
import com.example.EscuelaCrud.Repository.AlumnoRepository;

@Service
public class AlumnoServiceImplements implements AlumnoService {
    
    @Autowired

    private AlumnoRepository alumnoRepository;

    @Override
    @Transactional(readOnly=true)
    public List<AlumnoModel> findAll(){
        return (List<AlumnoModel>) alumnoRepository.findAll();
    }

    @Override
    @Transactional(readOnly=false)
    public AlumnoModel save(AlumnoModel alumno){
        return alumnoRepository.save(alumno);
    }

    @Override
    @Transactional(readOnly=true)
    public AlumnoModel findById(Integer id){
        return alumnoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id){
        alumnoRepository.deleteById(id);
    }

}
