package com.codellege.hotel;

public class Huésped {
    int Id;
    String Nombre;
    String Apellido;
    String FechaDeNacimiento;
    String Nacionalidad;
    int Teléfono;
    int IdReserva;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        FechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }

    public int getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(int teléfono) {
        Teléfono = teléfono;
    }

    public int getIdReserva() {
        return IdReserva;
    }

    public void setIdReserva(int idReserva) {
        IdReserva = idReserva;
    }

    @Override
    public String toString() {
        return "Huésped{" +
                "Id=" + Id +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", FechaDeNacimiento=" + FechaDeNacimiento +
                ", Nacionalidad='" + Nacionalidad + '\'' +
                ", Teléfono=" + Teléfono +
                ", IdReserva=" + IdReserva +
                '}';
    }
}
