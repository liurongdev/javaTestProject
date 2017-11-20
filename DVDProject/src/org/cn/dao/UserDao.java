package org.cn.dao;

import java.util.List;

import org.cn.entity.User;

public interface UserDao {
	public boolean insertUser(User user);
	public boolean deleteUser(int id);
	public boolean updateUser(User user);
	public User findUserById(int id);
	public List<User> findAllUser(String keyWork);
}
