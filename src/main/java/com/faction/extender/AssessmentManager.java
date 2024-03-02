package com.faction.extender;

import java.util.HashMap;

import java.util.List;

import com.faction.elements.Assessment;
import com.faction.elements.Vulnerability;
import com.faction.elements.results.AssessmentManagerResult;
import com.faction.elements.utils.Log;


public interface AssessmentManager extends BaseInterface{
	/**
	 * Operation This is a static list of events that can be used to control what happens when the event fires.
	 */
	static public enum Operation { Create, Update, Delete, 
		Finalize, PeerReviewCreated, PeerReviewCompleted,
		PeerReviewAccepted};
		
	
	/**
	 * assessmentChange is fired when any of the Operation events are fired. 
	 * 
	 * 
	 * @param assessment 		is the Current assessment
	 * @param vulns 	is the list of vulnerabilities that is related to this assessment. Will be 
	 * 					null if the Operation is Create. 
	 * @param operation	 Enum that is Create Update or Delete as defined by the Operation Static variable 
	 * 
	 * @return AssessmentManagerResult that contains the updated assessment and updated vulnerabilities.
	 */
	public AssessmentManagerResult assessmentChange(Assessment assessment, List<Vulnerability> vulns, Operation operation);
	


}
