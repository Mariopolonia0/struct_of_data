package EjercicioJava.proyecto_ayuda_al_moreno;

import java.io.*;

class Empleado implements Serializable {
    private String nombre;
    private String apellido;
    private String direccion;
    private String cedula;
    private String telefono;
    private String salario;
    private String fechaEntrada;

    public Empleado() {

        this.nombre = "";
        this.apellido = "";
        this.direccion = " ";
        this.cedula = "";
        this.telefono = "";
        this.salario = "";
        this.fechaEntrada = "";
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }


}