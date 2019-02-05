package com.cg.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.dao.ILoginDao;
import com.cg.dao.LoginDaoImpl;
import com.cg.dto.Login;
import com.cg.dto.RegisterDto;

@Service("loginService")
public class LoginServiceImpl implements ILoginService{
	
	@Autowired
	ILoginDao logDao=null;	
	
	public ILoginDao getLogDao() {
		return logDao;
	}
	
	public void setLogDao(ILoginDao logDao) {
		this.logDao = logDao;
	}

	@Override
	public boolean isUserExist(String username) {
		return logDao.isUserExist(username);
	}

	@Override
	public Login validateUser(Login login) {
		Login dbUser= logDao.validateUser(login);
		if(login.getUsername().equals(dbUser.getUsername())&&
				login.getPassword().equals(dbUser.getPassword())) 
		{
			return login;
		}
		else
		{
		return null;
		}
	}

	@Override
	public RegisterDto insertUserDetails(RegisterDto userDetails) {
		return logDao.insertUserDetails(userDetails);
	}

	@Override
	public ArrayList<RegisterDto> getAllUserDetails() {
		return logDao.getAllUserDetails();
	}

	@Override
	public RegisterDto deleteUsers(String uid) {
		return logDao.deleteUser(uid);
	}

	

}
