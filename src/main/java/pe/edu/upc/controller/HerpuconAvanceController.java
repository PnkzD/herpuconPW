package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.HerpuconAvance;
import pe.edu.upc.service.IHerpuconAvance;

@Named
@RequestScoped
public class HerpuconAvanceController {

	@Inject
	private IHerpuconAvance avanceservice;
	
	//atributos
	private HerpuconAvance avanceenti;
	List<HerpuconAvance>listaAvance;
	
	@PostConstruct
	public void init() {
		this.avanceenti=new HerpuconAvance();
		this.listaAvance = new ArrayList<HerpuconAvance>();	
		this.list();
	}
	
	public String nuevoAvance() {
		this.setAvanceenti(new HerpuconAvance());
		this.list();
		return "avance.xhtml";
	}
	
	public void insert() {
		avanceservice.insert(avanceenti);
		this.list();
		
	}
	public void list() {
		listaAvance = avanceservice.list();
	}

	public HerpuconAvance getAvanceenti() {
		return avanceenti;
	}

	public void setAvanceenti(HerpuconAvance avanceenti) {
		this.avanceenti = avanceenti;
	}

	public List<HerpuconAvance> getListaAvance() {
		return listaAvance;
	}

	public void setListaAvance(List<HerpuconAvance> listaAvance) {
		this.listaAvance = listaAvance;
	}
	
	
	
}
