package com.csm.Assessment.Dao;

import java.util.List;

import com.csm.Assessment.Model.Batch;

public interface BatchDao {
	void save(Batch batch);
	void update(Batch batch);
	List<Batch> get();
	Batch get(int batchid);
	void delete(int batchid);
}
