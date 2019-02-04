package com.cg.services;

import com.cg.dto.Login;
import com.cg.dto.RegisterDto;

public interface ILoginService {
	public boolean isUserExist(String username);
	public Login validateUser(Login login);
	public RegisterDto insertUserDetails(RegisterDto userDetails);
}
