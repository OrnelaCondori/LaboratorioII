package tp_UML_punto1;

public class Avion {
    private String aerolinea;
    private int numAvion;

    public Avion(){

    }
    public Avion(String aerolinea, int numAvion) {
        this.aerolinea = aerolinea;
        this.numAvion = numAvion;
    }

    // Getters y setters
    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public int getNumAvion() {
        return numAvion;
    }

    public void setNumAvion(int numAvion) {
        this.numAvion = numAvion;
    }
}
