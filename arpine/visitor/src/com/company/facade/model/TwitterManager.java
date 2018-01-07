package com.company.facade.model;

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.List;

import com.company.facade.Social;
import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Created by arpine on 1/7/18.
 */
public class TwitterManager
		implements Social {
	private List<String> users = new ArrayList<>();

	@Override
	public boolean hasAccess(String userName)
			throws AccessDeniedException {
		if (users.contains(userName)) {
			return true;
		}
		throw new AccessDeniedException("Access Denied");
	}

	public void retweet(String message) {
		System.out.println("Twitter retweet  " + message);

	}

	public void addUser(String userName)
			throws InvalidArgumentException {
		if (!users.contains(userName)) {
			users.add(userName);
			System.out.println("Twitter addUser " + userName);
		}
		else {
			throw new InvalidArgumentException(new String[] {"username exists", userName});
		}

	}
}
