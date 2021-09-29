package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pe.edu.upc.dao.IHerpuconObreroDao;
import pe.edu.upc.entities.HerpuconObrero;
import pe.edu.upc.service.IHerpuconObrero;

@Named
@RequestScoped

public class HerpuconObreroImpl implements IHerpuconObrero{

	@Inject
	private IHerpuconObreroDao hobdao;
	
	@Override
	public void insert(HerpuconObrero hob) {
		// TODO Auto-generated method stub
		hobdao.insert(hob);
		
	}

	@Override
	public List<HerpuconObrero> list() {
		// TODO Auto-generated method stub
		return hobdao.list();
	}

	
	
}
