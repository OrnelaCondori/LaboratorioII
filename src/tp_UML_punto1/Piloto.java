package tp_UML_punto1;

public class Piloto extends Persona implements Volador{
    private int licencia;
    private Persona piloto;

    public Piloto() {
    }

    public Piloto(int licencia) {
        this.licencia = licencia;
    }

    public Piloto(String nombre, String apellido, int dni, int licencia) {
        super(nombre, apellido, dni);
        this.licencia = licencia;
    }

    public int getLicencia() {
        return licencia;
    }

    @Override
    public void despegar() {
        System.out.println("El piloto "+ getNombre()+" "+ getApellido()+" despego");
    }
    @Override
    public void aterrizar() {
        System.out.println("El piloto "+ getNombre()+" "+ getApellido()+" aterrizo");
    }
}
