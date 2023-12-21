package com.faction.elements.results;

import java.util.List;

import com.faction.elements.Assessment;
import com.faction.elements.Vulnerability;

import java.util.ArrayList;

public class AssessmentManagerResult {
	
	private Assessment assessment;
	private List<Vulnerability> vulnerabilities;
	
	public Assessment getAssessment() {
		return this.assessment;
	}
	
	public void setAssessment(Assessment assessment) {
		this.assessment = assessment;
	}
	
	public List<Vulnerability> getVulnerabilities(){
		return this.vulnerabilities;
	}
	
	public void setVulnerabilities(List<Vulnerability> vulnerabilities) {
		this.vulnerabilities = vulnerabilities;
	}

}
