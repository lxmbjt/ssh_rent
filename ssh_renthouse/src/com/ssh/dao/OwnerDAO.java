package com.ssh.dao;

import com.ssh.dto.User;

public interface OwnerDAO {
	public User queryById(int userId);
}
