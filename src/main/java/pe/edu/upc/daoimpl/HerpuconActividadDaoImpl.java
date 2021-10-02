package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IHerpuconActividadDao;
import pe.edu.upc.entities.HerpuconActividad;

public class HerpuconActividadDaoImpl implements IHerpuconActividadDao{

	@PersistenceContext(unitName="herpuconPW")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(HerpuconActividad ha) {
		// TODO Auto-generated method stub
		try {
			em.persist(ha);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HerpuconActividad> list() {
		// TODO Auto-generated method stub
		List<HerpuconActividad> lista= new ArrayList<HerpuconActividad>();
		try {
			Query q= em.createQuery("select a from HerpuconActividad a");
			lista = (List<HerpuconActividad>) q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar");
		}
		
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int CActividad) {
		// TODO Auto-generated method stub
		HerpuconActividad he = new HerpuconActividad();
		try {
			he = em.getReference(HerpuconActividad.class, CActividad);
			em.remove(he);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
