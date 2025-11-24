package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.dto;

public class AutobusDTO {
    private long idAutobus;
    private String matricula;
    private String marca;
    private String anio;
    private int numeroAsientos;

    private TerminalDTO terminal;

    public long getIdAutobus() {
        return idAutobus;
    }

    public void setIdAutobus(long idAutobus) {
        this.idAutobus = idAutobus;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public TerminalDTO getTerminal() {
        return terminal;
    }

    public void setTerminal(TerminalDTO terminal) {
        this.terminal = terminal;
    }
}
