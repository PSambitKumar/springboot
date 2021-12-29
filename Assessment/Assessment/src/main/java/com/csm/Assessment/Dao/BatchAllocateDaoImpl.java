package com.csm.Assessment.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.csm.Assessment.Model.Batch;
import com.csm.Assessment.Model.BatchAllocate;

@Repository
public class BatchAllocateDaoImpl implements BatchAllocateDao {

	@Autowired
	EntityManager entityManager;
	
	@Override
	public void save(BatchAllocate batchAllocate) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(batchAllocate);
	}

	@Override
	public List<BatchAllocate> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<BatchAllocate> query = currentSession.createQuery("from BatchAllocate", BatchAllocate.class);
		List<BatchAllocate> list = query.getResultList();
		return list;
	}

	@Override
	public BatchAllocate get(int slno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int slno) {
		// TODO Auto-generated method stub
		
	}

}
