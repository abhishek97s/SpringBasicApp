package com.cg.services;

import com.cg.dto.Login;

public interface ILoginService {
	public boolean isUserExist(String username);
	public Login validateUser(Login login);
}
