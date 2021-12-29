package com.csm.Assessment.Service;

import java.util.List;

import com.csm.Assessment.Model.Batch;

public interface BatchService {
	void save(Batch batch);
	void update(Batch batch);
	List<Batch> get();
	Batch get(int batchid);
	void delete(int batchid);
}
