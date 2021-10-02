package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.HerpuconObrero;
import pe.edu.upc.service.IHerpuconObrero;

@Named
@RequestScoped
public class HerpuconObreroController {

	@Inject
	private IHerpuconObrero obreroservice;

	private HerpuconObrero obreroenti;
	List<HerpuconObrero> listaObrero;

	@PostConstruct
	public void init() {
		this.obreroenti = new HerpuconObrero();
		this.listaObrero = new ArrayList<HerpuconObrero>();
		this.list();
	}

	public String nuevoObrero() {

		this.setObreroenti(new HerpuconObrero());
		this.list();
		return "obrero.xhtml";
	}

	public void insert() {
		obreroservice.insert(obreroenti);
		this.list();
	}

	public void list() {
		listaObrero = obreroservice.list();
	}

	public void eliminar(HerpuconObrero obrero) {
		try {
			obreroservice.eliminar(obrero.getCObrero());
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public HerpuconObrero getObreroenti() {
		return obreroenti;
	}

	public void setObreroenti(HerpuconObrero obreroenti) {
		this.obreroenti = obreroenti;
	}

	public List<HerpuconObrero> getListaObrero() {
		return listaObrero;
	}

	public void setListaObrero(List<HerpuconObrero> listaObrero) {
		this.listaObrero = listaObrero;
	}

}
