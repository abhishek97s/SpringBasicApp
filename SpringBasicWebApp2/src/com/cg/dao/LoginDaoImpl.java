package com.cg.dao;

import org.springframework.stereotype.Repository;
import com.cg.dto.Login;

@Repository("loginDao")
public class LoginDaoImpl implements ILoginDao{
	@Override
	public boolean isUserExist(String username) {
		return false;
	}
	@Override
	public boolean validateUser(Login login) {
		return false;
	}
}
