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
@Table(name="Avance")
public class HerpuconAvance {
	
	
       @Id
       @GeneratedValue(strategy=GenerationType.IDENTITY)
       private int Cavance;
       
       @Column (name = "F_RegistroAvance", nullable=false,length=45)
       private String F_RegistroAvance;
       @Column (name= "D_Avance", nullable=false,length=45)
       private String D_Avance;
       @Column (name = "D_TipoAvance", nullable=false,length=45)
       private String D_TipoAvance;
       @ManyToOne
       @JoinColumn(name= "Dni_Trabajador",nullable=false)
       private HerpuconObrero Dni_Trabajador;
       
       
	public HerpuconAvance(int cavance, String f_RegistroAvance, String d_Avance, String d_TipoAvance,
			HerpuconObrero dni_Trabajador) {
		super();
		Cavance = cavance;
		F_RegistroAvance = f_RegistroAvance;
		D_Avance = d_Avance;
		D_TipoAvance = d_TipoAvance;
		Dni_Trabajador = dni_Trabajador;
	}
	public HerpuconAvance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCavance() {
		return Cavance;
	}
	public void setCavance(int cavance) {
		Cavance = cavance;
	}
	public String getF_RegistroAvance() {
		return F_RegistroAvance;
	}
	public void setF_RegistroAvance(String f_RegistroAvance) {
		F_RegistroAvance = f_RegistroAvance;
	}
	public String getD_Avance() {
		return D_Avance;
	}
	public void setD_Avance(String d_Avance) {
		D_Avance = d_Avance;
	}
	public String getD_TipoAvance() {
		return D_TipoAvance;
	}
	public void setD_TipoAvance(String d_TipoAvance) {
		D_TipoAvance = d_TipoAvance;
	}
	public HerpuconObrero getDni_Trabajador() {
		return Dni_Trabajador;
	}
	public void setDni_Trabajador(HerpuconObrero dni_Trabajador) {
		Dni_Trabajador = dni_Trabajador;
	}
       
       
     
       
       
       

	
	
}
