package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IHerpuconIncidenteDao;
import pe.edu.upc.entities.HerpuconIncidente;

public class HerpuconIncidenteDaoImpl implements IHerpuconIncidenteDao {

	@PersistenceContext(unitName="herpuconPW")
	private EntityManager em;
	
	@Transactional
	@Override
	public void inser(HerpuconIncidente hi) {
		// TODO Auto-generated method stub
		try {
			em.persist(hi);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HerpuconIncidente> list() {
		List<HerpuconIncidente> lista= new ArrayList<HerpuconIncidente>();
		
		try {
			
			Query q = em.createQuery("select hi from HerpuconIncidente hi");
			lista = (List<HerpuconIncidente>)q.getResultList();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar");
		}
		// TODO Auto-generated method stub
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int CCertificado) {
		HerpuconIncidente he = new HerpuconIncidente();
		try {
			he = em.getReference(HerpuconIncidente.class, CCertificado);
			em.remove(he);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}
