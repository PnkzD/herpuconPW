package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.HerpuconMaestroDeObra;
import pe.edu.upc.service.IHerpuconMaestroDeObra;

@Named
@RequestScoped
public class HerpuconMaestroDeObraController {

	@Inject
	private IHerpuconMaestroDeObra maestroservice;

	private HerpuconMaestroDeObra maestroenti;
	List<HerpuconMaestroDeObra> listaMaestro;

	@PostConstruct
	public void init() {
		this.maestroenti = new HerpuconMaestroDeObra();
		this.listaMaestro = new ArrayList<HerpuconMaestroDeObra>();
		this.list();
	}

	public String nuevoMaestro() {
        this.setMaestroenti(new HerpuconMaestroDeObra());
        this.list();
		return "maestro.xhtml";
	}

	public void insert() {
		maestroservice.insert(maestroenti);
		this.list();
	}

	public void list() {
		listaMaestro = maestroservice.list();
	}

	public HerpuconMaestroDeObra getMaestroenti() {
		return maestroenti;
	}

	public void setMaestroenti(HerpuconMaestroDeObra maestroenti) {
		this.maestroenti = maestroenti;
	}

	public List<HerpuconMaestroDeObra> getListaMaestro() {
		return listaMaestro;
	}

	public void setListaMaestro(List<HerpuconMaestroDeObra> listaMaestro) {
		this.listaMaestro = listaMaestro;
	}

}
