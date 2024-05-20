package com.guiestephano.service;

import com.guiestephano.domain.model.User;

public interface UserService {
	
	User findById(Long id);
	User create(User userToCreate);
	
}
