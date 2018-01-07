package com.company.facade.model;

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.List;

import com.company.facade.Social;

/**
 * Created by arpine on 1/7/18.
 */
public class GoogleManager
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

	public void share(String url) {
		System.out.println("Google  share " + url);

	}

	public void createAccount(String userName) {
		users.add(userName);
		System.out.println("Google createAccount " + userName);
	}
}
