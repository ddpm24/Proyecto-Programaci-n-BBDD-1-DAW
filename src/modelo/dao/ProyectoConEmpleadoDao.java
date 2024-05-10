package modelo.dao;

import java.util.List;

import modelo.entidades.ProyectoConEmpleado;

public interface ProyectoConEmpleadoDao  extends IntGenericoCrud<Integer, ProyectoConEmpleado>{

	List<ProyectoConEmpleadoDao> empleadosByProyecto(String codigoProyecto);
	int asignarEmpleadosAProyecto(List<ProyectoConEmpleadoDao> empleados); 
	int horasAsignadasAProyecto(String codigoProyecto); 
	double costeActualDeProyecto(String codigoProyecto);  
	double margenActualProyecto(String codigoProyecto); 
	
}