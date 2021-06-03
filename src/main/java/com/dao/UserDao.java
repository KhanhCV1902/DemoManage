package com.dao;

import com.model.Users;

public interface UserDao {
	public Users findByUserName(String username);
}
