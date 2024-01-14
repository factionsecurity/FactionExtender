package com.faction.elements.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

public class Log {
	
	public enum LEVEL { INFO, WARNING, ERROR, DEBUG };
	private LEVEL level;
	private String message;
	private String stackTrace;
	private Date timestamp;
	
	public Log(LEVEL level, Exception exception) {
		this.timestamp = new Date();
		this.level = level;
		this.message = exception.getMessage();
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		exception.printStackTrace(pw);
		this.stackTrace = sw.toString();
		
	}
	public Log(LEVEL level, String message) {
		this.timestamp = new Date();
		this.level = level;
		this.message = message;
		this.stackTrace = "";
		
	}
	public LEVEL getLevel() {
		return level;
	}
	public String getMessage() {
		return message;
	}
	public String getStackTrace() {
		return this.stackTrace;
	}
	
	public Date getTimeStamp() {
		return this.timestamp;
	}

}
