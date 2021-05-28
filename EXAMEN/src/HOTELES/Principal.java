package HOTELES;

public class Principal {
    public static void main(String[] args) {
        Hotel hotel1=new Hotel("Buenavista",12,38);
        Reservacion reservacion1 = new Reservacion("Mar", 2, 2, "20/3/2020", 2, 200);
        System.out.println("Esta es la capacidad del hotel "+hotel1.getNombre()+": " +hotel1.imprimirCapacidadHotel());
        System.out.println("Este es tu ticket: "+ reservacion1.imprimirTicket());
        System.out.println("Esto es lo que has pagado: "+reservacion1.imprimirPagoenPorcentaje()+"%");
        System.out.println("Porcentaje de disponibilidad: "+reservacion1.imprimirCapacidadHotel()+"%");

    }
}
