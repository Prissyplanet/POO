package HOTELES;

import java.util.Scanner;

public class Reservacion extends Hotel {
    private String fecha_Inicio;
    private int dias;
    private double anticipo;
    public Reservacion(String nombre,int ocupadas, int disponibles, String fecha_Inicio, int dias, double anticipo){
        super(nombre,ocupadas, disponibles);
        this.fecha_Inicio=fecha_Inicio;
        this.dias=dias;
        this.anticipo=anticipo;
    }

    public void setFecha_Inicio(String fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

    public String getFecha_Inicio() {
        return fecha_Inicio;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public void setAnticipo(double anticipo) {
        this.anticipo = anticipo;
    }

    public double getAnticipo() {
        return anticipo;
    }
    public double imprimirPagoenPorcentaje(){
        return (this.anticipo*100)/800;

    }
    public String imprimirTicket(){
        return "Ticket:\n" +
                "Hotel: "+ super.getNombre()+"\n" +
                "Fecha: "+ this.fecha_Inicio+"\n" +
                "Estancia: "+ this.dias+" días\n" +
                "Anticipo: "+ this.anticipo+"\n" +
                "Restante por pagar: "+(800-this.anticipo);

    }
@Override
public int imprimirCapacidadHotel(){
        return (this.disponibles*100)/(this.disponibles+this.ocupadas);

}
}
