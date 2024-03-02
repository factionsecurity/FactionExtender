package com.faction.extender;

import java.util.HashMap;
import java.util.List;

import com.faction.elements.utils.Log;

public interface BaseInterface {
	/**
	 * This function is used by Faction to set the configurations for the extension. This should not be called 
	 * locally in your classes
	 * 
	 * @param configs This is a a key-value pair of user supplied configs to be used by the extension. 
	 */
	public void setConfigs(HashMap<String,String>configs);
	
	
	/**
	 * This function is used by Faction to get all logs for the extension. This should not be called locally in
	 * your classes to report errors back to the faction UI
	 * 
	 * @return Returns a list of logs that can be displayed in the Faction UI
	 */
	public List<Log> getLogs();


}
