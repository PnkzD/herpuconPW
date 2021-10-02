package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IHerpuconProyectoDao;
import pe.edu.upc.entities.HerpuconProyecto;

public class HerpuconProyectoDaoImpl implements IHerpuconProyectoDao {

	@PersistenceContext(unitName="herpuconPW")
	private EntityManager em;
	
	@Transactional
	public void insert(HerpuconProyecto hp) {
		// TODO Auto-generated method stub
		
		try {
			
			em.persist(hp);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar");
		}
		
	}

	@SuppressWarnings("unchecked")
	public List<HerpuconProyecto> list() {
		// TODO Auto-generated method stub
		List<HerpuconProyecto>lista = new ArrayList<HerpuconProyecto>();
		try {
			Query q = em.createQuery("select hp from HerpuconProyecto hp ");
			lista = (List<HerpuconProyecto>)q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar");
		}
		return lista;
	}

	@Transactional
	public void eliminar(int CProyecto) {
		// TODO Auto-generated method stub
		HerpuconProyecto he = new HerpuconProyecto();
		try {
			he = em.getReference(HerpuconProyecto.class, CProyecto);
			em.remove(he);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	

}
