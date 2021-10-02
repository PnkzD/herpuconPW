package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.HerpuconAvance;

public interface IHerpuconAvance {
	
	public void insert(HerpuconAvance han);
	
	public List<HerpuconAvance> list();

	public void eliminar(int CAvance);
}
