package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "terminales")
public class Terminal {
    @Id
    @Column(name = "id_terminal")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTerminal;
    @Column(length = 45, nullable = false)
    private String estado;
    @Column(length = 45, nullable = false)
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
