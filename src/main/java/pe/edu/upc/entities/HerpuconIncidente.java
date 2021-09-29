package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Incidente")
public class HerpuconIncidente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Cincidente;
	
	@Column (name="Fecha_Incidente",nullable=false,length=45)
	private String Fecha_Incidente;
	@Column(name="D_Incidente",nullable=false,length=45)
	private String D_Incidente;
	@ManyToOne
	@JoinColumn(name="Dni_Trabajador",nullable=false)
	private HerpuconObrero Dni_Trabajador;
	public HerpuconIncidente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HerpuconIncidente(int cincidente, String fecha_Incidente, String d_Incidente,
			HerpuconObrero dni_Trabajador) {
		super();
		this.Cincidente = cincidente;
		this.Fecha_Incidente = fecha_Incidente;
		this.D_Incidente = d_Incidente;
		this.Dni_Trabajador = dni_Trabajador;
	}
	public int getCincidente() {
		return Cincidente;
	}
	public void setCincidente(int cincidente) {
		Cincidente = cincidente;
	}
	public String getFecha_Incidente() {
		return Fecha_Incidente;
	}
	public void setFecha_Incidente(String fecha_Incidente) {
		Fecha_Incidente = fecha_Incidente;
	}
	public String getD_Incidente() {
		return D_Incidente;
	}
	public void setD_Incidente(String d_Incidente) {
		D_Incidente = d_Incidente;
	}
	public HerpuconObrero getDni_Trabajador() {
		return Dni_Trabajador;
	}
	public void setDni_Trabajador(HerpuconObrero dni_Trabajador) {
		Dni_Trabajador = dni_Trabajador;
	}
	
	
	
}
