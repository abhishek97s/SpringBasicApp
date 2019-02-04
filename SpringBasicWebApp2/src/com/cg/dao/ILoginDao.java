package com.cg.dao;

import com.cg.dto.Login;

public interface ILoginDao {
	public boolean isUserExist(String username);
	public Login validateUser(Login login);
}
