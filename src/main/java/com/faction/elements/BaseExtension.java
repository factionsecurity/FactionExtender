package com.faction.elements;

import com.faction.elements.utils.Logger;
import com.faction.elements.utils.Log;

import java.util.HashMap;
import java.util.List;


/**
 * The Base Class is used to get logs and configs
 */
public class BaseExtension {
	
	private Logger logger;
	private HashMap<String,String> configs = new HashMap<>();
	
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
		return this.configs;
	}
	
	public void setConfigs(HashMap<String,String>configs) {
		this.configs = configs;
	}
	

}
