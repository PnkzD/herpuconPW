package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.HerpuconMaestroDeObra;

public interface IHerpuconMaestroDeObra {
	
	public void insert(HerpuconMaestroDeObra hma);
	
	public List<HerpuconMaestroDeObra> list();

}
