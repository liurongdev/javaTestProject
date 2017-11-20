package org.cn.dao;

import java.util.List;

import org.cn.entity.Record;

public interface RecordDao {
	public boolean insertRecord(Record record);
	public boolean deleteRecord(int id);
	public boolean updateRecord(Record record);
	public Record  findRecordById(int id);
	public List<Record> findAllRecord(String keyWord);
}

