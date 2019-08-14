package com.americaneagle.uiutils;

import java.sql.Connection;

import org.openqa.selenium.WebDriver;

public class Configuration {
	private WebDriver driver;
	private Connection dbconnection;
	
	
	public Connection getDbconnection() {
		return dbconnection;
	}
	public void setDbconnection(Connection dbconnection) {
		this.dbconnection = dbconnection;
	}
	private int timeOut;
	private String baseURL;
	private String username;
	private String dbhost;
	private String dbusername;
	private String dbpassword;
	
	
	public String getDbhost() {
		return dbhost;
	}
	public void setDbhost(String dbhost) {
		this.dbhost = dbhost;
	}
	public String getDbusername() {
		return dbusername;
	}
	public void setDbusername(String dbusername) {
		this.dbusername = dbusername;
	}
	public String getDbpassword() {
		return dbpassword;
	}
	public void setDbpassword(String dbpassword) {
		this.dbpassword = dbpassword;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
	public int getTimeOut() {
		return timeOut;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public void setTimeOut(int timeOut) {
		this.timeOut = timeOut;
	}
	public String getBaseURL() {
		return baseURL;
	}
	public void setBaseURL(String baseURL) {
		this.baseURL = baseURL;
	}
	
}
