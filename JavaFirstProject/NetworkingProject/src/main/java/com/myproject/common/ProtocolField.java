package com.myproject.common;

public enum ProtocolField {
	
	ID("id"),
	VERSION("version"), 
	REF_ID("refID"), 
	FILENAME("filename"), 
	LENGTH("lenght"), 
	CONTENT("content");

	private String name;

	ProtocolField(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
