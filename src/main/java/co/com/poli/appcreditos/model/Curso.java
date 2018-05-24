/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.model;

import java.util.Objects;

/**
 *
 * @author giovanny
 */
public class Curso {
    
    private String idCurso;
    private String nombre;
    private Double Horas;
    private Double valorCurso;
    private Boolean estado;

    public Curso(String idCurso, String nombre, Double Horas, Double valorCurso, Boolean estado) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.Horas = Horas;
        this.valorCurso = valorCurso;
        this.estado = estado;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getHoras() {
        return Horas;
    }

    public void setHoras(Double Horas) {
        this.Horas = Horas;
    }

    public Double getValorCurso() {
        return valorCurso;
    }

    public void setValorCurso(Double valorCurso) {
        this.valorCurso = valorCurso;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.idCurso);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        if (!Objects.equals(this.idCurso, other.idCurso)) {
            return false;
        }
        return true;
    }

    
    
    
}
