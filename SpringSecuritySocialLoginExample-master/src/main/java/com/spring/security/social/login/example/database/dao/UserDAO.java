package com.spring.security.social.login.example.database.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.spring.security.social.login.example.database.model.User;


/**
 * @author <a href="mailto:psunil1278@gmail.com">Sunil Kumar</a>
 * @since 26/12/15
 */
@Service
public class UserDAO implements GenericDao<User,String> {

    @Autowired
    JdbcTemplate template;

	@Override
	public int update(Integer id) {
		
		return 0;
	}

	public void save(User user) {
		// TODO Auto-generated method stub
		
	}

	public User get(String email) {
		// TODO Auto-generated method stub
		return null;
	}  

    
  

}
