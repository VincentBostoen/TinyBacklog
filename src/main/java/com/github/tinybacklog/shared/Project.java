package com.github.tinybacklog.shared;

import java.io.Serializable;

public class Project implements Serializable {
	
	private static final long serialVersionUID = 5620098144663297192L;
	
	private String name;
	private String summary;
	private String userMail;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
}
