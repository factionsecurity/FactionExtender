package com.faction.extender;

import java.util.HashMap;

import com.faction.elements.User;
import com.faction.elements.Verification;
import com.faction.elements.Vulnerability;

public interface VerificationManager extends BaseInterface {
	
	/**
	 * Operation This is a static list of events that can be used to control what happens when the event fires.
	 */
	static public enum Operation { Cancel, PASS,FAIL,Assigned};
	
	/**
	 * This method fires when there is a change to a verification/retest event.
	 * 
	 * @param changeUser			This is the user that changed the vulnerability
	 * @param vulnerability		This the vulnerability that is being modified
	 * @param verification		This is the verification object
	 * @param operation			An Enum operation. Values are Cancel, PASS, FAIL, or Assigned
	 * @return             		All Operations return the updated vulnerability. If return value is null then 
	 *                     		Faction will not update the internal database.
	 */
	public Vulnerability verificationChange(User changeUser, Vulnerability vulnerability, Verification verification, Operation operation);
	
	
}
