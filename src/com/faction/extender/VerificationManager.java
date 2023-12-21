package com.faction.extender;

import java.util.Date;

import com.faction.elements.Assessment;
import com.faction.elements.User;
import com.faction.elements.Vulnerability;
import com.faction.extender.AssessmentManager.Operation;

public interface VerificationManager {
	static public enum Operation { Cancel, PASS,FAIL,Assigned};
	
	/**
	 * @param changer      This is the user that changed the vulnerability
	 * @param vuln         This the vulnerability that is being modified
	 * @param notes        This is the added notes when verification is passed or failed.
	 * @param start        The start date for the verification
	 * @param end          The expected end date of the end date for the verification
	 * @param operation    An Enum operation. Values are Cancel, PASS, FAIL, or Assigned
	 * @return             All Operations return the updated vulnerability. If return value is null then 
	 *                     Faction will not update the internal database.
	 */
	public Vulnerability verificationChange(User changer, Vulnerability vuln, String AssessorNotes, Date start, Date end, Operation Operation);
	
	
}
