package tp_UML_punto1;

public class Vuelo {
    private String destino;
    private String horario;
    private Avion avionAsociado;

    public Vuelo(String destino, String horario) {
        this.destino = destino;
        this.horario = horario;
    }

    // Getters y setters
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

    public Avion getAvionAsociado() {
        return avionAsociado;
    }

    public void setAvionAsociado(Avion avionAsociado) {
        this.avionAsociado = avionAsociado;
    }
}
