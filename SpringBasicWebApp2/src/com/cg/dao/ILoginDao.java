package com.cg.dao;

import java.util.ArrayList;

import com.cg.dto.Login;
import com.cg.dto.RegisterDto;

public interface ILoginDao {
	public boolean isUserExist(String username);
	public Login validateUser(Login login);
	public RegisterDto insertUserDetails(RegisterDto userDetails);
	public ArrayList<RegisterDto> getAllUserDetails();
}
