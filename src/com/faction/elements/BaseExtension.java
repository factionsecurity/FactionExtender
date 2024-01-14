package com.faction.elements;

import com.faction.elements.utils.Logger;
import com.faction.elements.utils.Log;

import java.util.HashMap;
import java.util.List;


public class BaseExtension {
	
	private Logger logger;
	private HashMap<String,String> configs;
	
	public BaseExtension() {
		logger = new Logger();
	}
	
	public Logger getLogger() {
		return logger;
	}
	
	public List<Log> getLogs(){
		return logger.getLogs();
	}
	
	public HashMap<String,String> getConfigs(){
		return this.getConfigs();
	}
	
	public void setConfigs(HashMap<String,String>configs) {
		this.configs = configs;
	}
	

}
