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
public class Usuario {
    
    private String documento;
    private String nombres;
    private String apellidos;
    private String tipotrabajador;
    private String tipocredito;
    private String trabajaenlacompania;

    public Usuario(String documento, String nombres, String apellidos, String tipotrabajador, String tipocredito, String trabajaenlacompania) {
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipotrabajador = tipotrabajador;
        this.tipocredito = tipocredito;
        this.trabajaenlacompania = trabajaenlacompania;

    }


    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String gettipotrabajador() {
        return tipotrabajador;
    }

    public void settipotrabajador(String tipotrabajador) {
        this.tipotrabajador = tipotrabajador;
    }

    public String gettipocredito() {
        return tipocredito;
    }

    public void settipocredito(String tipocredito) {
        this.tipocredito = tipocredito;
    }

    public String gettrabajaenlacompania() {
        return trabajaenlacompania;
    }

    public void settrabajaenlacompania(String trabajaenlacompania) {
        this.trabajaenlacompania = trabajaenlacompania;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.documento);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.documento, other.documento)) {
            return false;
        }
        return true;
    }
    
    
    
}
