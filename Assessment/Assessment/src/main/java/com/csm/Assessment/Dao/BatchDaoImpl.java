package com.csm.Assessment.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.csm.Assessment.Model.Batch;


@Repository
public class BatchDaoImpl implements BatchDao {

	@Autowired
	EntityManager entityManager;

	@Override
	public void save(Batch batch) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(batch);
	}

	@Override
	public List<Batch> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Batch> query = currentSession.createQuery("from Batch", Batch.class);
		List<Batch> list = query.getResultList();
		return list;
	}

	@Override
	public Batch get(int batchid) {
		Session currentSession = entityManager.unwrap(Session.class);
		Batch batch = currentSession.get(Batch.class, batchid);
		return batch;
	}

	@Override
	public void delete(int batchid) {
		Session currentSession = entityManager.unwrap(Session.class);
		Batch batch = currentSession.get(Batch.class, batchid);
		currentSession.delete(batch);
	}

	@Override
	public void update(Batch batch) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.update(batch);
	}	

}
