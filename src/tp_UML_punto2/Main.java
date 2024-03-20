package tp_UML_punto2;

public class Main {
    public static void main(String[] args) {
        Avion av1 = new Avion("Singapus Airlines", 2345);
        Persona per1 = new Persona("Magali", "Gomez", 40589562);
        Vuelo vue1 = new Vuelo("Madrid", "10:00hs");

        vue1.setAvion(av1);

        /*Para reserva necesita datas de aerolinea, destino y pasajero, por lo que necesita los 3 objetos */
        Reserva res1 = new Reserva(vue1,av1,per1);
        res1.datosReserva();
    }
}