package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IHerpuconAvanceDao;
import pe.edu.upc.entities.HerpuconAvance;

public class HerpuconAvanceDaoImpl implements IHerpuconAvanceDao{

	@PersistenceContext(unitName="herpuconPW")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(HerpuconAvance han) {
		// TODO Auto-generated method stub
		try {
			em.persist(han);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HerpuconAvance> list() {
		
		List<HerpuconAvance> lista = new ArrayList<HerpuconAvance>();
		
		try {
			Query q = em.createQuery("select han from HerpuconAvance han");
			lista = (List<HerpuconAvance>)q.getResultList();
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar");
		}
		// TODO Auto-generated method stub
		return lista;
	}

	
}
