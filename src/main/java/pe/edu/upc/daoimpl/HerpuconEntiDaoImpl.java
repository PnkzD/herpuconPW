package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IHerpuconDao;
import pe.edu.upc.entities.HerpuconEnti;

public class HerpuconEntiDaoImpl implements IHerpuconDao {

	@PersistenceContext(unitName = "herpuconPW")
	private EntityManager em;

	@Transactional
	//listar
	public void insert(HerpuconEnti he) {
		// TODO Auto-generated method stub
		try {
			em.persist(he);;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	
	//listar
	public List<HerpuconEnti> list() {
		// TODO Auto-generated method stub
		List<HerpuconEnti> lista = new ArrayList<HerpuconEnti>();

		try {

			Query q = em.createQuery("select h from HerpuconEnti h");
			lista = (List<HerpuconEnti>) q.getResultList();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar");
		}

		return lista;
	}
	
	
	@Override
	public void eliminar(int Cdni) {
		// TODO Auto-generated method stub
		HerpuconEnti he = new HerpuconEnti();
		try {
			he = em.getReference(HerpuconEnti.class, Cdni);
			em.remove(he);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
