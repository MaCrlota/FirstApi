package com.codellege.hotel;

public class Reservas extends Huésped{
    int Id;
    String FechaEntrada;
    String FechaSalida;
    int Valor;
    String FormaPago;

    public void IdReserva() {
        Id = IdReserva;
    }

    public String getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        FechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        FechaSalida = fechaSalida;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int valor) {
        Valor = valor;
    }

    public String getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(String formaPago) {
        FormaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Reservas{" +
                "Id=" + Id +
                ", FechaEntrada='" + FechaEntrada + '\'' +
                ", FechaSalida='" + FechaSalida + '\'' +
                ", Valor=" + Valor +
                ", FormaPago='" + FormaPago + '\'' +
                '}';
    }
}
