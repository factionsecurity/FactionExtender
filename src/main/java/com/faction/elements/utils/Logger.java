package com.faction.elements.utils;

import java.util.ArrayList;
import java.util.List;

import com.faction.elements.utils.Log.LEVEL;

public class Logger {

	private List<Log> logs = new ArrayList<Log>();

	/**
	 * Add a log to the queue using the Java Exception
	 * 
	 * @param level     Enum that is INFO, WARNING, ERROR, DEBUG
	 * @param exception The Java Exception
	 */
	public void addLog(LEVEL level, Exception exception) {
		logs.add(new Log(level, exception));
	}

	/**
	 * Add a log to the queue using a String
	 * 
	 * @param level   Enum that is INFO, WARNING, ERROR, DEBUG
	 * @param message String of the message to be logged
	 */
	public void addLog(LEVEL level, String message) {
		logs.add(new Log(level, message));
	}

	/**
	 * Get a list of the current logs.
	 * 
	 * @return List of logs
	 */
	public List<Log> getLogs() {
		logs.sort((l1, l2) -> l1.getTimeStamp().compareTo(l2.getTimeStamp()));
		return logs;

	}

}
