package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IHerpuconIncidenteDao;
import pe.edu.upc.entities.HerpuconIncidente;
import pe.edu.upc.service.IHerpuconIncidente;

@Named
@RequestScoped
public class HerpuconIncidenteImpl implements IHerpuconIncidente{

	@Inject
	private IHerpuconIncidenteDao hidao;
	
	@Override
	public void insert(HerpuconIncidente hi) {
		// TODO Auto-generated method stub
		hidao.inser(hi);
	}

	@Override
	public List<HerpuconIncidente> list() {
		// TODO Auto-generated method stub
		return hidao.list();
	}
	
	

}
