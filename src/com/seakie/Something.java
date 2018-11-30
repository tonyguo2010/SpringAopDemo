package com.seakie;

import org.springframework.stereotype.Component;

public class Something {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void yell(String string) {
		System.out.println(string);
	}
}
