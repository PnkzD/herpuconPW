package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IHerpuconMaestroDeObraDao;
import pe.edu.upc.entities.HerpuconMaestroDeObra;
import pe.edu.upc.service.IHerpuconMaestroDeObra;

@Named
@RequestScoped

public class HerpuconMaestroDeObraImpl implements IHerpuconMaestroDeObra {

	@Inject
	private IHerpuconMaestroDeObraDao hmadao;
	
	@Override
	public void insert(HerpuconMaestroDeObra hma) {
		// TODO Auto-generated method stub
		hmadao.insert(hma);
	}

	@Override
	public List<HerpuconMaestroDeObra> list() {
		// TODO Auto-generated method stub
		return hmadao.list();
	}

	@Override
	public void eliminar(int CMaestro) {
		// TODO Auto-generated method stub
		hmadao.eliminar(CMaestro);
	}

}
