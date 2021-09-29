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
@Table(name="Actividad")
public class HerpuconActividad {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int CActividad;
	
	@Column(name="D_NombreActividad",nullable=false,length=45)
	private String D_NombreActividad;
	@Column(name="I_TipoActividad",nullable=false,length=45)
	private String I_TipoActividad;
	@Column(name="Estado_Conclusion",nullable=false,length=45)
	private String Estado_Conclusion;
	@Column(name="Nivel_Desempenio",nullable=false,length=45)
    private String Nivel_Desempenio;	
	
	@ManyToOne
	@JoinColumn(name="Dni_Trabajador",nullable=false)
	private HerpuconObrero Dni_Trabajador;
	@Column(name="Fecha_Actividad",nullable=false,length=45)
	private String Fecha_Actividad;
	public HerpuconActividad(int cActividad, String d_NombreActividad, String i_TipoActividad, String estado_Conclusion,
			String nivel_Desempenio, HerpuconObrero dni_Trabajador, String fecha_Actividad) {
		super();
		this.CActividad = cActividad;
		this.D_NombreActividad = d_NombreActividad;
		this.I_TipoActividad = i_TipoActividad;
		this.Estado_Conclusion = estado_Conclusion;
		this.Nivel_Desempenio = nivel_Desempenio;
		this.Dni_Trabajador = dni_Trabajador;
		this.Fecha_Actividad = fecha_Actividad;
	}
	public HerpuconActividad() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCActividad() {
		return CActividad;
	}
	public void setCActividad(int cActividad) {
		CActividad = cActividad;
	}
	public String getD_NombreActividad() {
		return D_NombreActividad;
	}
	public void setD_NombreActividad(String d_NombreActividad) {
		D_NombreActividad = d_NombreActividad;
	}
	public String getI_TipoActividad() {
		return I_TipoActividad;
	}
	public void setI_TipoActividad(String i_TipoActividad) {
		I_TipoActividad = i_TipoActividad;
	}
	public String getEstado_Conclusion() {
		return Estado_Conclusion;
	}
	public void setEstado_Conclusion(String estado_Conclusion) {
		Estado_Conclusion = estado_Conclusion;
	}
	public String getNivel_Desempenio() {
		return Nivel_Desempenio;
	}
	public void setNivel_Desempenio(String nivel_Desempenio) {
		Nivel_Desempenio = nivel_Desempenio;
	}
	public HerpuconObrero getDni_Trabajador() {
		return Dni_Trabajador;
	}
	public void setDni_Trabajador(HerpuconObrero dni_Trabajador) {
		Dni_Trabajador = dni_Trabajador;
	}
	public String getFecha_Actividad() {
		return Fecha_Actividad;
	}
	public void setFecha_Actividad(String fecha_Actividad) {
		Fecha_Actividad = fecha_Actividad;
	}
	
	
	
}
