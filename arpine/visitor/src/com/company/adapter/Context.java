package com.company.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arpine on 12/18/17.
 */
public class Context {
	private List<Integer> accessibleUsers = new ArrayList<>();
	private final String currentLanguageId;
	private final Integer currentUserId;

	public Context(List<Integer> accessibleUsers, String currentLanguageId, Integer currentUserId) {
		this.accessibleUsers = accessibleUsers;
		this.currentLanguageId = currentLanguageId;
		this.currentUserId = currentUserId;
	}

	public List<Integer> getAccessibleUsers() {
		return accessibleUsers;
	}

	public void addAccessibleUser(Integer accessibleUser) {
		this.accessibleUsers.add(accessibleUser);
	}

	public String getCurrentLanguageId() {
		return currentLanguageId;
	}

	public Integer getCurrentUserId() {
		return currentUserId;
	}
}
