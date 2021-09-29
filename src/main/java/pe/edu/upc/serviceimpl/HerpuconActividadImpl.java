package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IHerpuconActividadDao;
import pe.edu.upc.entities.HerpuconActividad;
import pe.edu.upc.service.IHerpuconActividad;

@Named
@RequestScoped

public class HerpuconActividadImpl implements IHerpuconActividad{

	@Inject
	private IHerpuconActividadDao hadao;
	
	@Override
	public void insert(HerpuconActividad ha) {
		// TODO Auto-generated method stub
		hadao.insert(ha);
	}

	@Override
	public List<HerpuconActividad> list() {
		// TODO Auto-generated method stub
		return hadao.list();
	}

	
	
}
