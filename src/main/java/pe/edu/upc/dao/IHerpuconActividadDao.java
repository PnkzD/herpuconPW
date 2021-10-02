package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.HerpuconActividad;

public interface IHerpuconActividadDao {
	
	public void insert(HerpuconActividad ha);
	
	public List<HerpuconActividad> list();

	public void eliminar(int CActividad);
}
