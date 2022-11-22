package pe.edu.upc.trickfit.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "DNI", length = 8, nullable = false)
    private String DNI;
    @Column(name = "nombreUsuario", length = 30, nullable = false)
    private String nombreUsuario;
    @Column(name = "estaturaUsuario", nullable = false)
    private int estaturaUsuario;
    @Column(name = "pesoUsuario", nullable = false)
    private int pesoUsuario;
    @ManyToOne
    @JoinColumn(name = "idTipoUsuario", nullable = false)
    private Tipo_usuario tipo_usuario;
    @Column(name = "emailUsuario", length = 50, nullable = false)
    private String emailUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String DNI, String nombreUsuario, int estaturaUsuario, int pesoUsuario, Tipo_usuario tipo_usuario, String emailUsuario) {
        this.idUsuario = idUsuario;
        this.DNI = DNI;
        this.nombreUsuario = nombreUsuario;
        this.estaturaUsuario = estaturaUsuario;
        this.pesoUsuario = pesoUsuario;
        this.tipo_usuario = tipo_usuario;
        this.emailUsuario = emailUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getEstaturaUsuario() {
        return estaturaUsuario;
    }

    public void setEstaturaUsuario(int estaturaUsuario) {
        this.estaturaUsuario = estaturaUsuario;
    }

    public int getPesoUsuario() {
        return pesoUsuario;
    }

    public void setPesoUsuario(int pesoUsuario) {
        this.pesoUsuario = pesoUsuario;
    }

    public Tipo_usuario getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(Tipo_usuario tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }
}
