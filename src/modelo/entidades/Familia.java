package modelo.entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;


/**
 * The persistent class for the familias database table.
 * 
 */
@Entity
@Table(name="familias")
@NamedQuery(name="Familia.findAll", query="SELECT f FROM Familia f")
public class Familia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_familia")
	private int idFamilia;

	private String descripcion;

	public Familia() {
	}

	public int getIdFamilia() {
		return this.idFamilia;
	}

	public void setIdFamilia(int idFamilia) {
		this.idFamilia = idFamilia;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descripcion, idFamilia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Familia other = (Familia) obj;
		return Objects.equals(descripcion, other.descripcion) && idFamilia == other.idFamilia;
	}

	@Override
	public String toString() {
		return "Familia [idFamilia=" + idFamilia + ", descripcion=" + descripcion + "]";
	}

	public Familia(int idFamilia, String descripcion) {
		super();
		this.idFamilia = idFamilia;
		this.descripcion = descripcion;
	}

	
	
}