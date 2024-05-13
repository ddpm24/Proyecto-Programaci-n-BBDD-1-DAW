package modelo.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;


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

	@Override
	public int hashCode() {
		return Objects.hash(idPerfil, nombre, tasaStandard);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		return idPerfil == other.idPerfil && Objects.equals(nombre, other.nombre)
				&& Objects.equals(tasaStandard, other.tasaStandard);
	}

	public Perfil(int idPerfil, String nombre, BigDecimal tasaStandard) {
		super();
		this.idPerfil = idPerfil;
		this.nombre = nombre;
		this.tasaStandard = tasaStandard;
	}

	
	
}