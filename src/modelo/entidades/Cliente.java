package modelo.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the clientes database table.
 * 
 */
@Entity
@Table(name="clientes")
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cif;

	private String apellidos;

	private String domicilio;

	@Column(name="facturacion_anual")
	private BigDecimal facturacionAnual;

	public Cliente(String cif, String apellidos, String domicilio, BigDecimal facturacionAnual, String nombre,
			int numeroEmpleados) {
		super();
		this.cif = cif;
		this.apellidos = apellidos;
		this.domicilio = domicilio;
		this.facturacionAnual = facturacionAnual;
		this.nombre = nombre;
		this.numeroEmpleados = numeroEmpleados;
	}

	private String nombre;

	@Column(name="numero_empleados")
	private int numeroEmpleados;

	public Cliente() {
	}

	public String getCif() {
		return this.cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public BigDecimal getFacturacionAnual() {
		return this.facturacionAnual;
	}

	public void setFacturacionAnual(BigDecimal facturacionAnual) {
		this.facturacionAnual = facturacionAnual;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroEmpleados() {
		return this.numeroEmpleados;
	}

	public void setNumeroEmpleados(int numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}

	@Override
	public String toString() {
		return "Cliente [cif=" + cif + ", apellidos=" + apellidos + ", domicilio=" + domicilio + ", facturacionAnual="
				+ facturacionAnual + ", nombre=" + nombre + ", numeroEmpleados=" + numeroEmpleados + "]";
	}

}