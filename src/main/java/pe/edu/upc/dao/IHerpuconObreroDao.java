package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.HerpuconObrero;

public interface IHerpuconObreroDao {

	public void insert(HerpuconObrero hob);
	
	public List<HerpuconObrero> list();
}
