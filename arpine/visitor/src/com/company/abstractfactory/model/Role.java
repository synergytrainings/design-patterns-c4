package com.company.abstractfactory.model;

/**
 * Created by arpine on 11/19/17.
 */
public class Role {
	private Integer id;
	private String name;

	public Role(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
