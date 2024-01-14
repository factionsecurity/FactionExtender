package com.faction.extender;

import java.util.HashMap;
import java.util.List;

import com.faction.elements.utils.Log;

public interface BaseInterface {
	/**
	 * This function is used by Faction to set the configurations for the extension. This should not be called 
	 * locally in your classes
	 * 
	 * @param configs
	 */
	public void setConfigs(HashMap<String,String>configs);
	
	
	/**
	 * This function is used by Faction to get all logs for the extension. This should not be called locally in
	 * your classes
	 * 
	 * @return List<Log> logs : Returns a list of logs that can be displayed in the Faction UI
	 */
	public List<Log> getLogs();


}
