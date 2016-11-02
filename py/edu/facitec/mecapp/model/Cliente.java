/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mecapp.model;

/**
 *
 * @author ADRIANDJ
 */
public class Cliente {
    
    private int codigo;
    private String ciruc;
    private String nombre;
    private String apellido;
    private String direccion;
    private String ciudad;
    private String telefono;

    public Cliente() {
        this.ciruc="";
        this.apellido="";
        this.ciudad="";
        this.direccion="";
        this.nombre="";
        this.telefono="";
       
    }

    public Cliente(String ciruc, String nombre, String apellido, String direccion, String ciudad, String telefono) {
        this.ciruc = ciruc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public String getCiruc() {
        return ciruc;
    }

    public void setCiruc(String ciruc) {
        this.ciruc = ciruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
}

