package modelo.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;


/**
 * The persistent class for the proyectos database table.
 * 
 */
@Entity
@Table(name="proyectos")
@NamedQuery(name="Proyecto.findAll", query="SELECT p FROM Proyecto p")
public class Proyecto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_proyecto")
	private String idProyecto;

	@Column(name="coste_real")
	private BigDecimal costeReal;

	@Column(name="costes_previsto")
	private BigDecimal costesPrevisto;

	private String descripcion;

	private String estado;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_fin_previsto")
	private Date fechaFinPrevisto;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_fin_real")
	private Date fechaFinReal;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_inicio")
	private Date fechaInicio;

	@Column(name="venta_previsto")
	private BigDecimal ventaPrevisto;

	//uni-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="cif")
	private Cliente cliente;

	//bi-directional many-to-one association to Empleado
	@ManyToOne
	@JoinColumn(name="jefe_proyecto")
	private Empleado empleado;

	public Proyecto() {
	}
	
	

	public Proyecto(String idProyecto, BigDecimal costeReal, BigDecimal costesPrevisto, String descripcion,
			String estado, Date fechaFinPrevisto, Date fechaFinReal, Date fechaInicio, BigDecimal ventaPrevisto,
			Cliente cliente, Empleado empleado) {
		super();
		this.idProyecto = idProyecto;
		this.costeReal = costeReal;
		this.costesPrevisto = costesPrevisto;
		this.descripcion = descripcion;
		this.estado = estado;
		this.fechaFinPrevisto = fechaFinPrevisto;
		this.fechaFinReal = fechaFinReal;
		this.fechaInicio = fechaInicio;
		this.ventaPrevisto = ventaPrevisto;
		this.cliente = cliente;
		this.empleado = empleado;
	}



	public String getIdProyecto() {
		return this.idProyecto;
	}

	public void setIdProyecto(String idProyecto) {
		this.idProyecto = idProyecto;
	}

	public BigDecimal getCosteReal() {
		return this.costeReal;
	}

	public void setCosteReal(BigDecimal costeReal) {
		this.costeReal = costeReal;
	}

	public BigDecimal getCostesPrevisto() {
		return this.costesPrevisto;
	}

	public void setCostesPrevisto(BigDecimal costesPrevisto) {
		this.costesPrevisto = costesPrevisto;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaFinPrevisto() {
		return this.fechaFinPrevisto;
	}

	public void setFechaFinPrevisto(Date fechaFinPrevisto) {
		this.fechaFinPrevisto = fechaFinPrevisto;
	}

	public Date getFechaFinReal() {
		return this.fechaFinReal;
	}

	public void setFechaFinReal(Date fechaFinReal) {
		this.fechaFinReal = fechaFinReal;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public BigDecimal getVentaPrevisto() {
		return this.ventaPrevisto;
	}

	public void setVentaPrevisto(BigDecimal ventaPrevisto) {
		this.ventaPrevisto = ventaPrevisto;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}


	@Override
	public String toString() {
		return "Proyecto [idProyecto=" + idProyecto + ", costeReal=" + costeReal + ", costesPrevisto=" + costesPrevisto
				+ ", descripcion=" + descripcion + ", estado=" + estado + ", fechaFinPrevisto=" + fechaFinPrevisto
				+ ", fechaFinReal=" + fechaFinReal + ", fechaInicio=" + fechaInicio + ", ventaPrevisto=" + ventaPrevisto
				+ ", cliente=" + cliente + ", empleado=" + empleado + "]";
	}

	public double margenPrevisto(Proyecto proyecto) {
		return  this.ventaPrevisto.doubleValue() - this.costesPrevisto.doubleValue();
	}
	
	public double margenReal() {
		 return this.ventaPrevisto.doubleValue() - this.costeReal.doubleValue();
	}
	
	public double diferenciasGastos() {
		return this.costeReal.doubleValue() - this.costesPrevisto.doubleValue();
	}
	
	public int diferenciaFinPrevistoReal() {
		return (int) (fechaFinReal.getTime() - fechaFinPrevisto.getTime());
	}

	public double totalFacturado() {
		return costeReal.doubleValue();
	 }

	@Override
	public int hashCode() {
		return Objects.hash(cliente, costeReal, costesPrevisto, descripcion, empleado, estado, fechaFinPrevisto,
				fechaFinReal, fechaInicio, idProyecto, ventaPrevisto);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proyecto other = (Proyecto) obj;
		return Objects.equals(cliente, other.cliente) && Objects.equals(costeReal, other.costeReal)
				&& Objects.equals(costesPrevisto, other.costesPrevisto)
				&& Objects.equals(descripcion, other.descripcion) && Objects.equals(empleado, other.empleado)
				&& Objects.equals(estado, other.estado) && Objects.equals(fechaFinPrevisto, other.fechaFinPrevisto)
				&& Objects.equals(fechaFinReal, other.fechaFinReal) && Objects.equals(fechaInicio, other.fechaInicio)
				&& Objects.equals(idProyecto, other.idProyecto) && Objects.equals(ventaPrevisto, other.ventaPrevisto);
	}
	
	
	
}