package tp_UML_punto1;

public class Reserva {
    private Vuelo vuelo;
    private Avion avion;
    private Persona pasajero;

    public Reserva() {
    }
    public Reserva(Vuelo vuelo, Avion avion, Persona pasajero) {
        this.vuelo = vuelo;
        this.avion = avion;
        this.pasajero = pasajero;
    }

}
