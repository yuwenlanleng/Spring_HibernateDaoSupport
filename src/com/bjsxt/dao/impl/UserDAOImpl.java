package com.bjsxt.dao.impl;

import org.springframework.stereotype.Component;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

@Component("u") 
public class UserDAOImpl extends SuperDAO implements UserDAO {

	//new UserDAOImpl( new AbstractDAO

	public void save(User user) {
		
			this.getHibernateTemplate().save(user);
			
		//throw new RuntimeException("exeption!");
	}

}
