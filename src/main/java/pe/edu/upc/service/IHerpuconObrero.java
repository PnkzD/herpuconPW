package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.HerpuconObrero;

public interface IHerpuconObrero {
	
	public void insert(HerpuconObrero hob);
	
	public List<HerpuconObrero> list();

}
