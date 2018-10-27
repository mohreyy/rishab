package com.cg.springmvccc.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.springmvccc.dto.Mobile;

@Repository("mobiledao")
public class MobileDaoImpl implements IMobileDao {
	@PersistenceContext
	EntityManager em;

	@Override
	public void addMobile(Mobile mobile) {
		em.persist(mobile);
		em.flush();
		
	}

	
	
	
	

}
