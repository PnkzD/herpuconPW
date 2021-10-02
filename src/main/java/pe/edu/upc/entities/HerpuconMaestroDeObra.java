package pe.edu.upc.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="MaestroDeObra")
public class HerpuconMaestroDeObra implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CMaestro;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Cdni",referencedColumnName = "Cdni")
	private HerpuconEnti dnipersona;
	
	@Column(name="T_Equipamento",nullable=false,length=50)
	private String T_Equipamento;
	
	@Column(name="D_Estudios",nullable=false,length=100)
	private String D_Estudios;

	@ManyToMany(mappedBy="maestros")
	private List<HerpuconProyecto> proyectos = new ArrayList<HerpuconProyecto>();
	public HerpuconMaestroDeObra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HerpuconMaestroDeObra(int cMaestro, HerpuconEnti dnipersona, String t_Equipamento, String d_Estudios) {
		super();
		this.CMaestro = cMaestro;
		this.dnipersona = dnipersona;
		this.T_Equipamento = t_Equipamento;
		this.D_Estudios = d_Estudios;
	}

	public int getCMaestro() {
		return CMaestro;
	}

	public void setCMaestro(int cMaestro) {
		CMaestro = cMaestro;
	}

	public HerpuconEnti getDnipersona() {
		return dnipersona;
	}

	public void setDnipersona(HerpuconEnti dnipersona) {
		this.dnipersona = dnipersona;
	}

	public String getT_Equipamento() {
		return T_Equipamento;
	}

	public void setT_Equipamento(String t_Equipamento) {
		T_Equipamento = t_Equipamento;
	}

	public String getD_Estudios() {
		return D_Estudios;
	}

	public void setD_Estudios(String d_Estudios) {
		D_Estudios = d_Estudios;
	}
	
 
}
