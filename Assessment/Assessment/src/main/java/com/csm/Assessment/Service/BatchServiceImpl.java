package com.csm.Assessment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csm.Assessment.Dao.BatchDao;
import com.csm.Assessment.Model.Batch;


@Service
public class BatchServiceImpl implements BatchService {

	@Autowired
	BatchDao batchDao;
	
	@Transactional
	@Override
	public void save(Batch batch) {
		batchDao.save(batch);
	}

	@Transactional
	@Override
	public List<Batch> get() {
		return batchDao.get();
	}

	@Transactional
	@Override
	public Batch get(int batchid) {
		return batchDao.get(batchid);
	}
	
	@Transactional
	@Override
	public void delete(int batchid) {
		batchDao.delete(batchid);
	}

	@Override
	public void update(Batch batch) {
		batchDao.update(batch);
	}



}
