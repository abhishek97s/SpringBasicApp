package com.cg.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Repository;
import com.cg.dto.Login;
import com.cg.dto.RegisterDto;
import com.sun.glass.ui.CommonDialogs.Type;

@Repository("loginDao")
@Transactional
public class LoginDaoImpl implements ILoginDao{

	@PersistenceContext
	EntityManager entityManager= null;

	@Override
	public boolean isUserExist(String userName) {
		Login user = entityManager.find(Login.class, userName);
		if(user!= null) return true;
		return false;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Login validateUser(Login login) {
		Login user = entityManager.find(Login.class, login.getUsername());
		if (user != null) return user;
		return null;
	}

	@Override
	public RegisterDto insertUserDetails(RegisterDto userDetails) {
		Login logObj= new Login();
		logObj.setUsername(userDetails.getUname());
		logObj.setPassword(userDetails.getPwd());
		entityManager.persist(logObj);
		entityManager.persist(userDetails);
		RegisterDto rd= entityManager.find(RegisterDto.class, userDetails.getUname());
		return rd;
	}

	@Override
	public ArrayList<RegisterDto> getAllUserDetails() {
		String query= "SELECT reg FROM RegisterDto reg";
		TypedQuery<RegisterDto> tq= entityManager.createQuery(query, RegisterDto.class);
		ArrayList<RegisterDto> uList= (ArrayList<RegisterDto>)tq.getResultList();
		return uList;
	}

	@Override
	public RegisterDto deleteUser(String uid) {
		RegisterDto reg=entityManager.find(RegisterDto.class, uid);
		entityManager.remove(reg);
		entityManager.remove(entityManager.find(Login.class, uid));
		return reg;
	}


}
