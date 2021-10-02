package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IHerpuconMaestroDeObraDao;
import pe.edu.upc.entities.HerpuconMaestroDeObra;

public class HerpuconMaestroDeObraDaoImpl implements IHerpuconMaestroDeObraDao{

	@PersistenceContext(unitName="herpuconPW")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(HerpuconMaestroDeObra hma) {
		// TODO Auto-generated method stub
		try {
			em.persist(hma);
			
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println("Error al insertar");
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HerpuconMaestroDeObra> list() {
		
		List<HerpuconMaestroDeObra> lista= new ArrayList<HerpuconMaestroDeObra>();
		
		try {
			Query q = em.createQuery("select hma from HerpuconMaestroDeObra hma");
			lista = (List<HerpuconMaestroDeObra>)q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar");
		}
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public void eliminar(int CMaestro) {
		// TODO Auto-generated method stub
		HerpuconMaestroDeObra he = new HerpuconMaestroDeObra();
		try {
			he = em.getReference(HerpuconMaestroDeObra.class, CMaestro);
			em.remove(he);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}
