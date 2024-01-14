package com.faction.extender;

import java.util.HashMap;

import java.util.List;

import com.faction.elements.Assessment;
import com.faction.elements.Vulnerability;
import com.faction.elements.results.AssessmentManagerResult;
import com.faction.elements.utils.Log;
import com.faction.elements.BaseExtension;


public interface AssessmentManager{
	static public enum Operation { Create, Update, Delete, 
		Finalize, PeerReviewCreated, PeerReviewCompleted,
		PeerReviewAccepted};
		
	
	/**
	 * This function allows you to update other interfaces when the command is run. This can also up
	 * 
	 * 
	 * @param asmt 		is the Current assessment
	 * @param vulns 	is the list of vulnerabilities that is related to this assessment. Will be 
	 * 					null if the Operation is Create. 
	 * @param Operation	is Create Update or Delete as defined by the Operation Static variable 
	 */
	public AssessmentManagerResult assessmentChange(Assessment asmt, List<Vulnerability> vulns, Operation Operation, HashMap<String,String> configs);
	
	
	


}
