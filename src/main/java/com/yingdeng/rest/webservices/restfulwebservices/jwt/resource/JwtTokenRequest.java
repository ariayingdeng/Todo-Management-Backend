package com.yingdeng.rest.webservices.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class JwtTokenRequest implements Serializable {

	private static final long serialVersionUID = -5616176897013108345L;

	private String username;
	private String password;

//    {
//    	"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTY0OTg5NjIxMiwiaWF0IjoxNjQ5MjkxNDEyfQ.wtxEFWrtB6FkpulJ3kpe2D54klPcihZOdVf2i0WLiC4Yy6NPvD77aICR_8VCY-m9CD63JGwkwZPu9eNvLUJAjQ"
//    	}
	
//	{
//		"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ5aW5nIiwiZXhwIjoxNjUwMDAxMDMwLCJpYXQiOjE2NDkzOTYyMzB9.KmwAdDpPODyz7KRFwta6jyIcFv7lFGKhaMXU2NnHwvHq07Sff4zfKRIGmWHxA3TnArJ-fq4Umj6G_RlSJBTcxg"
//		}

	public JwtTokenRequest() {
		super();
	}

	public JwtTokenRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
