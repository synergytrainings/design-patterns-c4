package com.company.abstractfactory.dao;

import com.company.abstractfactory.model.User;

/**
 * Created by arpine on 11/19/17.
 */
public interface UserDao {
	Integer createUser(User user);

	User getUserById(Integer id);
}
