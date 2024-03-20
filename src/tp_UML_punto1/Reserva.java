package tp_UML_punto1;

public class Reserva {
    private Vuelo vueloAsociado;
    private String nombrePasajero;

    public Reserva(){

    }
    public Reserva(Vuelo vueloAsociado, String nombrePasajero) {
        this.vueloAsociado = vueloAsociado;
        this.nombrePasajero = nombrePasajero;
    }
}
