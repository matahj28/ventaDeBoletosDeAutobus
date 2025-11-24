package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.dto;

public class TerminalDTO {
    private long idTerminal;
    private String estado;
    private String nombre;

    public long getIdTerminal() {
        return idTerminal;
    }

    public void setIdTerminal(long idTerminal) {
        this.idTerminal = idTerminal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
