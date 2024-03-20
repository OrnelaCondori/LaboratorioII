package tp_UML_punto2;

public class Vuelo {
    private String destino;
    private String horario;
    private Avion avion;

    public Vuelo() {
    }

    public Vuelo(String destino, String horario) {
        this.destino = destino;
        this.horario = horario;
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

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Avion getAvion() {
        return avion;
    }
}
