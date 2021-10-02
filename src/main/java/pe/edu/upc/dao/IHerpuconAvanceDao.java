package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.HerpuconAvance;

public interface IHerpuconAvanceDao {
	
	public void insert(HerpuconAvance han);
	
	public List<HerpuconAvance> list();
	
	public void eliminar(int CAvance);

}
