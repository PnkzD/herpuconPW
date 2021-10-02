package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.HerpuconIncidente;

public interface IHerpuconIncidente {
	
	public void insert(HerpuconIncidente hi);
	
	public List<HerpuconIncidente> list();
	
	public void eliminar(int CIncidente);

}
