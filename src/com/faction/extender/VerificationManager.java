package com.faction.extender;

import java.util.HashMap;

import com.faction.elements.User;
import com.faction.elements.Verification;
import com.faction.elements.Vulnerability;

public interface VerificationManager {
	static public enum Operation { Cancel, PASS,FAIL,Assigned};
	
	/**
	 * @param changer			This is the user that changed the vulnerability
	 * @param vulnerability		This the vulnerability that is being modified
	 * @param verification		This is the verification object
	 * @param operation			An Enum operation. Values are Cancel, PASS, FAIL, or Assigned
	 * @return             		All Operations return the updated vulnerability. If return value is null then 
	 *                     		Faction will not update the internal database.
	 */
	public Vulnerability verificationChange(User changer, Vulnerability vulnerability, Verification verification, Operation Operation, HashMap<String,String> configs);
	
	
}
