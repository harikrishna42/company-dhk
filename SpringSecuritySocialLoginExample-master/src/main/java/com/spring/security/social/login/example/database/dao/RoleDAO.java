package com.spring.security.social.login.example.database.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.spring.security.social.login.example.database.model.Role;



@Service
public class RoleDAO implements GenericDao<Role,Integer>{

    @Autowired
    private JdbcTemplate jdbctemplate;  

    @Override
    public int update(final Integer id) {
        return jdbctemplate.update("INSERT INTO SomeTable(column1, column2) VALUES(?,?)");
    }

   
}
