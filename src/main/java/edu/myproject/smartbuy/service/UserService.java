package edu.myproject.smartbuy.service;


import edu.myproject.smartbuy.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
