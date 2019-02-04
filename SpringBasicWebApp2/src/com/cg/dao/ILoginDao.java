package com.cg.dao;

import com.cg.dto.Login;
import com.cg.dto.RegisterDto;

public interface ILoginDao {
	public boolean isUserExist(String username);
	public Login validateUser(Login login);
	public RegisterDto insertUserDetails(RegisterDto userDetails);
}
