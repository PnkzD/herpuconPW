package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.HerpuconActividad;
import pe.edu.upc.service.IHerpuconActividad;

@Named
@RequestScoped
public class HerpuconActividadController {
	
	@Inject
	private IHerpuconActividad actividadservice;
	
	//atributos init
	private HerpuconActividad actividadenti;
	List<HerpuconActividad> listaActividad;
	
	@PostConstruct
	public void init() {
		this.actividadenti = new HerpuconActividad();
		this.listaActividad = new ArrayList<HerpuconActividad>();
		this.list();
	}
	public String nuevaActividad() {
		this.setActividadenti(new HerpuconActividad());
		this.list();
		return "actividad.xhtml";
	}
	public void insert() {
		actividadservice.insert(actividadenti);
		this.list();
	}
	public void list() {
		listaActividad=actividadservice.list();
	}
	public HerpuconActividad getActividadenti() {
		return actividadenti;
	}
	public void setActividadenti(HerpuconActividad actividadenti) {
		this.actividadenti = actividadenti;
	}
	public List<HerpuconActividad> getListaActividad() {
		return listaActividad;
	}
	public void setListaActividad(List<HerpuconActividad> listaActividad) {
		this.listaActividad = listaActividad;
	}
	
	

}
