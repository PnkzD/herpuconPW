package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.HerpuconMaestroDeObra;

public interface IHerpuconMaestroDeObraDao {

	public void insert(HerpuconMaestroDeObra hma);
	
	public List<HerpuconMaestroDeObra> list();
	
	public void eliminar(int CMaestro);
}
