package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.HerpuconIncidente;

public interface IHerpuconIncidenteDao {

	public void inser(HerpuconIncidente hi);
	
	public List<HerpuconIncidente> list();
}
