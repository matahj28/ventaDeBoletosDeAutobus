package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "autobuses")
public class Autobus {
    @Id
    @Column(name = "id_autobus")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAutobus;
    @Column(length = 45, nullable = false, unique = true)
    private String matricula;
    @Column(length = 45, nullable = false)
    private String marca;
    @Column(length = 45, nullable = false)
    private String anio;
    @Column(name = "numero_asientos", length = 45, nullable = false)
    private int numeroAsientos;

    @ManyToOne
    @JoinColumn(name = "id_terminal", referencedColumnName = "id_terminal", nullable = false)
    private Terminal terminal;

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

    public Terminal getTerminal() {
        return terminal;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }
}
