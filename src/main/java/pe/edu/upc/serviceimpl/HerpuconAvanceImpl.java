package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IHerpuconAvanceDao;
import pe.edu.upc.entities.HerpuconAvance;
import pe.edu.upc.service.IHerpuconAvance;

@Named
@RequestScoped
public class HerpuconAvanceImpl implements IHerpuconAvance {
	@Inject
	private IHerpuconAvanceDao handao;

	@Override
	public void insert(HerpuconAvance han) {
		// TODO Auto-generated method stub
		handao.insert(han);
	}

	@Override
	public List<HerpuconAvance> list() {
		// TODO Auto-generated method stub
		return handao.list();
	}

}
