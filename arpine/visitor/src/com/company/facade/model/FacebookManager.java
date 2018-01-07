package com.company.facade.model;

import java.nio.file.AccessDeniedException;
import java.util.HashMap;
import java.util.Map;

import com.company.facade.Social;
import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Created by arpine on 1/7/18.
 */
public class FacebookManager
		implements Social {
	private Map<String, String> users = new HashMap();

	@Override
	public boolean hasAccess(String userName)
			throws AccessDeniedException {
		if (users.containsKey(userName)) {
			return true;
		}
		throw new AccessDeniedException("Access Denied");
	}

	public void share(String message) {
		System.out.println("Facebook share " + message);

	}

	public void register(String userName, String password)
			throws InvalidArgumentException {
		if (!users.containsKey(userName)) {
			users.put(userName, password);
			System.out.println("Facebook register user " + userName + " " + password);
		}
		else {
			throw new InvalidArgumentException(new String[] {"username exists", userName});
		}

	}

}
