package com.csm.Assessment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csm.Assessment.Dao.BatchAllocateDao;
import com.csm.Assessment.Model.BatchAllocate;

@Service
public class BatchAllocateServiceImpl implements BatchAllocateService{

	@Autowired
	BatchAllocateDao batchAllocateDao;
	
	@Transactional
	@Override
	public void save(BatchAllocate batchAllocate) {
		batchAllocateDao.save(batchAllocate);
		
	}
	@Transactional
	@Override
	public List<BatchAllocate> get() {
		return batchAllocateDao.get();
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
