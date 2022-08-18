package com.example.EscuelaCrud.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Alumno")
public class AlumnoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer Id;

    @Column(name = "Nombre")
    private String Nombre;
    
    @Column(name = "ApellidoPaterno")
    private String ApellidoPaterno;
    
    @Column(name = "ApellidoMaterno")
    private String ApellidoMaterno;

    @Column(name = "FechaNacimiento")
    private Date FechaNacimiento;

    @Column(name = "Sexo")
    private String Sexo;

    @Column(name = "GradoEstudiosActual")
    private String GradoEstudiosActual;
    
    @Column(name = "Email")
    private String Email;

    @Column(name = "Telefono")
    private Integer Telefono;

    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        ApellidoPaterno = apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        ApellidoMaterno = apellidoMaterno;
    }
    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }
    public String getSexo() {
        return Sexo;
    }
    public void setSexo(String sexo) {
        Sexo = sexo;
    }
    public String getGradoEstudiosActual() {
        return GradoEstudiosActual;
    }
    public void setGradoEstudiosActual(String gradoEstudiosActual) {
        GradoEstudiosActual = gradoEstudiosActual;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public Integer getTelefono() {
        return Telefono;
    }
    public void setTelefono(Integer telefono) {
        Telefono = telefono;
    }
}
