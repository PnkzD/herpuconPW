package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.HerpuconIncidente;
import pe.edu.upc.service.IHerpuconIncidente;

@Named
@RequestScoped
public class HerpuconIncidenteController {

	@Inject
	private IHerpuconIncidente incidenteservice;

	// atributos
	private HerpuconIncidente incidenteenti;
	List<HerpuconIncidente> listaIncidente;

	@PostConstruct
	public void init() {
		this.incidenteenti = new HerpuconIncidente();
		this.listaIncidente = new ArrayList<HerpuconIncidente>();
		this.list();
	}

	public String nuevoIncidente() {
		this.setIncidenteenti(new HerpuconIncidente());
		this.list();
		return "incidente.xhtml";
	}

	public void insert() {
		incidenteservice.insert(incidenteenti);
		this.list();
	}

	public void list() {
		listaIncidente = incidenteservice.list();
	}

	public HerpuconIncidente getIncidenteenti() {
		return incidenteenti;
	}

	public void setIncidenteenti(HerpuconIncidente incidenteenti) {
		this.incidenteenti = incidenteenti;
	}

	public List<HerpuconIncidente> getListaIncidente() {
		return listaIncidente;
	}

	public void setListaIncidente(List<HerpuconIncidente> listaIncidente) {
		this.listaIncidente = listaIncidente;
	}

}
