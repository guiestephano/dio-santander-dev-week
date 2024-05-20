package com.guiestephano.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.guiestephano.domain.model.User;
import com.guiestephano.domain.repository.UserRepository;
import com.guiestephano.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User userToCreate) {
		if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
			throw new IllegalArgumentException("This user ID already exists.");
		}
		return userRepository.save(userToCreate);
	}

}
