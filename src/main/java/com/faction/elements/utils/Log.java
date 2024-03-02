package com.faction.elements.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

public class Log {

	public enum LEVEL {
		INFO, WARNING, ERROR, DEBUG
	};

	private LEVEL level;
	private String message;
	private String stackTrace;
	private Date timestamp;

	/**
	 * This class is mostly used by Faction to get logs and is therefore not
	 * intended to be used by extension developers
	 * 
	 * @param level
	 * @param exception
	 */
	public Log(LEVEL level, Exception exception) {
		this.timestamp = new Date();
		this.level = level;
		this.message = exception.getMessage();
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		exception.printStackTrace(pw);
		this.stackTrace = sw.toString();

	}

	/**
	 * This class is mostly used by Faction to get logs and is therefore not
	 * intended to be used by extension developers
	 * 
	 * @param level
	 * @param message
	 */
	public Log(LEVEL level, String message) {
		this.timestamp = new Date();
		this.level = level;
		this.message = message;
		this.stackTrace = "";

	}

	/**
	 * This method is mostly used by Faction to get logs and is therefore not
	 * intended to be used by extension developers
	 * 
	 * @return
	 */
	public LEVEL getLevel() {
		return level;
	}

	/**
	 * This method is mostly used by Faction to get logs and is therefore not
	 * intended to be used by extension developers
	 * 
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * This method is mostly used by Faction to get logs and is therefore not
	 * intended to be used by extension developers
	 * 
	 * @return
	 */
	public String getStackTrace() {
		return this.stackTrace;
	}

	/**
	 * This method is mostly used by Faction to get logs and is therefore not
	 * intended to be used by extension developers
	 * 
	 * @return
	 */
	public Date getTimeStamp() {
		return this.timestamp;
	}

}
