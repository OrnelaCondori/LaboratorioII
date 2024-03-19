package tp_UML_punto1;

public class Vuelo {
    private String destino;
    private String horario;
    private Avion numAvion;

    public Vuelo() {
    }

    public Vuelo(String destino, String horario, Avion numAvion) {
        this.destino = destino;
        this.horario = horario;
        this.numAvion = numAvion;
    }

    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public Avion getNumAvion() {
        return numAvion;
    }
    public void setNumAvion(Avion numAvion) {
        this.numAvion = numAvion;
    }
}
