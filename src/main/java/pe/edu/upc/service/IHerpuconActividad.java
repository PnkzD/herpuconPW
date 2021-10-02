package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.HerpuconActividad;

public interface IHerpuconActividad {
	
	public void insert(HerpuconActividad ha);
	
	public List<HerpuconActividad> list();
	
	public void eliminar(int CActividad);

}
