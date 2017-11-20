package com.company.abstractfactory.dao;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by arpine on 11/19/17.
 */
public interface DbConnection {
	ConcurrentHashMap<String, String> getQueries();
}
