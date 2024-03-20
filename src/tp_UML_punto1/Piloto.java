package tp_UML_punto1;

public class Piloto extends Persona implements Volador{
    private int numLicencia;

    public Piloto() {
    }

    public Piloto(String nombre, String apellido, int dni, int numLicencia) {
        super(nombre, apellido, dni);
        this.numLicencia = numLicencia;
    }

    public int getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(int numLicencia) {
        this.numLicencia = numLicencia;
    }

    @Override
    public void despegar() {
        System.out.println("El piloto " + getNombre() + " despegó");
    }
    @Override
    public void aterrizar() {
        System.out.println("El piloto " + getNombre() + " aterrizó");
    }
}
