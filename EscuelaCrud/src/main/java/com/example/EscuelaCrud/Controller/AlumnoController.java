package com.example.EscuelaCrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EscuelaCrud.Model.AlumnoModel;
import com.example.EscuelaCrud.Service.AlumnoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/alumnosapi")
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/alumnos")
    public List<AlumnoModel> listarAlumnos(){
        return alumnoService.findAll();
    }

    @PostMapping("/alumno")
    public AlumnoModel GuardarAlumno(@RequestBody AlumnoModel alumno){
        return alumnoService.save(alumno);
    }

    @GetMapping("/alumno/{id}")
    public AlumnoModel BuscarAlumno(@PathVariable Integer id){
        return alumnoService.findById(id);
    }

    @DeleteMapping("/alumno/{id}")
    public void EliminarAlumno(@PathVariable Integer id){
        alumnoService.delete(id);
    }
}
