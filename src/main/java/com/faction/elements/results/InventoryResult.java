package com.faction.elements.results;

import java.util.HashMap;

public class InventoryResult {
	private String ApplicationId;
	private String ApplicationName;
	private String DistributionList;
	private HashMap<String, String> CustomFields = new HashMap<String, String>();

	/**
	 * Gets the current application id
	 * 
	 * @return Returns the Application Id
	 */
	public String getApplicationId() {
		return ApplicationId;
	}

	/**
	 * Gets the current application name
	 * 
	 * @return Returns the Application Name
	 */
	public String getApplicationName() {
		return ApplicationName;
	}

	/**
	 * Get all custom fields assigned to this assessment
	 * 
	 * @return Returns the a key value pair of custom fields. The key must be an
	 *         exact match to the variable name in Faction
	 */
	public HashMap<String, String> getCustomFields() {
		return CustomFields;
	}

	/**
	 * Update the Application Id
	 * 
	 * @param applicationId is the ID of the application. This is not the Faction
	 *                      Database ID
	 */
	public void setApplicationId(String applicationId) {
		ApplicationId = applicationId;
	}

	/**
	 * Update the applicaiton name
	 * 
	 * @param applicationName Is the Name of the Application
	 */
	public void setApplicationName(String applicationName) {
		ApplicationName = applicationName;
	}

	/**
	 * Update custom fields
	 * 
	 * @param customFields key value pairs where the key must match to a custom
	 *                     variable name in Faction
	 */
	public void setCustomFields(HashMap<String, String> customFields) {
		CustomFields = customFields;
	}

	/**
	 * Get the email distribution list
	 * 
	 * @return a distribution list the is a string of email addresses separated by a
	 * ';'
	 */
	public String getDistributionList() {
		return DistributionList;
	}

	/**
	 * Set an updated distribution list
	 * 
	 * @param distributionList is a string of email addresses separated by a ';'
	 */
	public void setDistributionList(String distributionList) {
		DistributionList = distributionList;
	}

}
