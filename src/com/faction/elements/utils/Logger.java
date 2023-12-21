package com.faction.elements.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Logger {
	
	public enum LEVEL { INFO, WARNING, ERROR, DEBUG };
	private LEVEL level;
	private String message;
	private String stackTrace;
	
	public Logger(LEVEL level, Exception exception) {
		this.level = level;
		this.message = exception.getMessage();
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		exception.printStackTrace(pw);
		this.stackTrace = sw.toString();
		
	}
	public LEVEL getLevel() {
		return level;
	}
	public void setLevel(LEVEL level) {
		this.level = level;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStackTrace() {
		return this.stackTrace;
	}
	
	
	
	
	
	
	

}
