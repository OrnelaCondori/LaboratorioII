package tp_UML_punto2;

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

    public void datosReserva(){
        System.out.println("Nombre: "+ pasajero.getNombre()+ "   Apellido: "+pasajero.getApellido());
        System.out.println("DNI: "+ pasajero.getDni());
        System.out.println("Aerolinea: "+ avion.getAerolinea());
        System.out.println("Destino: "+ vuelo.getDestino());
        System.out.println("Horario: "+ vuelo.getHorario());
    }

}
