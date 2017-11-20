package org.cn.dao;

import java.util.List;

import org.cn.entity.Dvd;

public interface DvdDao {
	public boolean insertDvd(Dvd dvd);
	public boolean deleteDvd(int id);
	public boolean updateDvd(Dvd dvd);
	public Dvd  findDvdById(int id);
	public List<Dvd> findAllDvd(String keyword);
}
