package tp_UML_punto1;

public class Avion {
    private String aerolinea;
    private int numeroAvion;

    public Avion() {
    }

    public Avion(String aerolinea, int numeroAvion) {
        this.aerolinea = aerolinea;
        this.numeroAvion = numeroAvion;
    }

    public String getAerolinea() {
        return aerolinea;
    }
    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }
    public int getNumeroAvion() {
        return numeroAvion;
    }
    public void setNumeroAvion(int numeroAvion) {
        this.numeroAvion = numeroAvion;
    }
}
