package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IHerpuconObreroDao;
import pe.edu.upc.entities.HerpuconObrero;

public class HerpuconObreroDaoImpl implements IHerpuconObreroDao{

	@PersistenceContext(unitName="herpuconPW")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(HerpuconObrero hob) {
		// TODO Auto-generated method stub
		try {
			em.persist(hob);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HerpuconObrero> list() {
		// TODO Auto-generated method stub
		List<HerpuconObrero> lista= new ArrayList<HerpuconObrero>();
		
		try {
			Query q = em.createQuery("select hob from HerpuconObrero hob");
			lista = (List<HerpuconObrero>)q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar");
		}
		return lista;
	}
 
	
}
