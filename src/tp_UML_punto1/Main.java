package tp_UML_punto1;


public class Main {
    public static void main(String[] args) {

        /* asociacion */
        Avion avion1 = new Avion("Argentina", 456);
        Vuelo vuelo1 = new Vuelo("Buenos Aires", "11.00hs");
        vuelo1.setAvionAsociado(avion1);

        /* Composicion */
        Flota flota1 = new Flota(avion1);

        /*Agregacion */
        Vuelo vuelo2 = new Vuelo("Madrid", "06:00hs");
        Reserva reserva1 = new Reserva(vuelo1, "Martin");

        /* Herencia */
        Persona per1 = new Persona("Maria", "Perez", 12547896);
        Piloto pilo1 = new Piloto("Guadalupe", "Aban", 45876985, 3456);

        /* Implementación */
        pilo1.aterrizar();
    }

}