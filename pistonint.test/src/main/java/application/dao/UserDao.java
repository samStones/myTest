package application.dao;

import application.pojo.User;

public interface UserDao {
	
	public User findUserById(String id);
}
