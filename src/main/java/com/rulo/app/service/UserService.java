package com.rulo.app.service;

import com.rulo.app.model.User;

public interface UserService {

	void save(User user);

	User findByUsername(String username);
}