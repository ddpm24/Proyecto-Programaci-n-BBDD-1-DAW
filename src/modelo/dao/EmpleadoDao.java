package modelo.dao;

import java.util.List;

import modelo.entidades.Empleado;

public interface EmpleadoDao extends IntGenericoCrud<Integer, Empleado> {
	
	List<Empleado> empleadosByDepartamento(int idDepar);
	List<Empleado> empleadosBySexo(char sexo); 
	List<Empleado> empleadosByApellido(String subcadena);
	double salarioTotal(); 
	double salarioTotal(int idDepar);
	Empleado buscarUno(int i);
	boolean eliminar(int clave); 
	
}
