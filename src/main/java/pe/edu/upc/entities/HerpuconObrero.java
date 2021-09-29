package pe.edu.upc.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Obrero")
public class HerpuconObrero implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CObrero;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Cdni",nullable=false)
	private HerpuconEnti dnipersona;
	
	@ManyToOne
	@JoinColumn(name="CProyecto",nullable=false)
	private HerpuconProyecto CProyecto;
	@Column(name="Rol_Especifico",nullable=false)
	private String Rol_Especifico;
	public HerpuconObrero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HerpuconObrero(int cObrero, HerpuconEnti dnipersona, HerpuconProyecto cProyecto, String rol_Especifico) {
		super();
		this.CObrero = cObrero;
		this.dnipersona = dnipersona;
		this.CProyecto = cProyecto;
		this.Rol_Especifico = rol_Especifico;
	}
	public int getCObrero() {
		return CObrero;
	}
	public void setCObrero(int cObrero) {
		CObrero = cObrero;
	}
	public HerpuconEnti getDnipersona() {
		return dnipersona;
	}
	public void setDnipersona(HerpuconEnti dnipersona) {
		this.dnipersona = dnipersona;
	}
	public HerpuconProyecto getCProyecto() {
		return CProyecto;
	}
	public void setCProyecto(HerpuconProyecto cProyecto) {
		CProyecto = cProyecto;
	}
	public String getRol_Especifico() {
		return Rol_Especifico;
	}
	public void setRol_Especifico(String rol_Especifico) {
		Rol_Especifico = rol_Especifico;
	}
	
	
	
}
