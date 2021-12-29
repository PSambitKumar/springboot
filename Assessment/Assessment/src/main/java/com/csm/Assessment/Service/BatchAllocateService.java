package com.csm.Assessment.Service;

import java.util.List;

import com.csm.Assessment.Model.BatchAllocate;

public interface BatchAllocateService {
	void save(BatchAllocate batchAllocate);
	List<BatchAllocate> get();
	BatchAllocate get(int slno);
	void delete(int slno);
}
