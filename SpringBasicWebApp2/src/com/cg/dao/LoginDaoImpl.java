package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Repository;
import com.cg.dto.Login;

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
}
