package com.faction.elements.utils;

import java.util.ArrayList;
import java.util.List;

import com.faction.elements.utils.Log.LEVEL;

public class Logger {
	
	List<Log> logs = new ArrayList<Log>();
	
	public void addLog(LEVEL level, Exception exception) {
		logs.add(new Log(level, exception));
	}
	public void addLog(LEVEL level, String message) {
		logs.add(new Log(level, message));
	}
	public List<Log> getLogs() {
		logs.sort((l1,l2) -> l1.getTimeStamp().compareTo(l2.getTimeStamp()));
		return logs;
		
	}
	
	

}
