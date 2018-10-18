package com.spring.security.social.login.example.database.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T extends Serializable, K extends Serializable> {


	int update(Integer id);
}