package modelo.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the perfiles database table.
 * 
 */
@Entity
@Table(name="perfiles")
@NamedQuery(name="Perfil.findAll", query="SELECT p FROM Perfil p")
public class Perfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_perfil")
	private int idPerfil;

	private String nombre;

	@Column(name="tasa_standard")
	private BigDecimal tasaStandard;

	public Perfil() {
	}

	
	
	public Perfil(int idPerfil, String nombre, BigDecimal tasaStandard) {
		super();
		this.idPerfil = idPerfil;
		this.nombre = nombre;
		this.tasaStandard = tasaStandard;
	}



	



	public int getIdPerfil() {
		return this.idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getTasaStandard() {
		return this.tasaStandard;
	}

	public void setTasaStandard(BigDecimal tasaStandard) {
		this.tasaStandard = tasaStandard;
	}



	@Override
	public String toString() {
		return "Perfil [idPerfil=" + idPerfil + ", nombre=" + nombre + ", tasaStandard=" + tasaStandard + "]";
	}

}