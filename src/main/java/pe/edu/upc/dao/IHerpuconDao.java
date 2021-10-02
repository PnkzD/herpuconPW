package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.HerpuconEnti;

public interface IHerpuconDao {

	public void insert(HerpuconEnti he);
	
	public void eliminar(int Cdni);
	
	public List<HerpuconEnti> list();
	
}
