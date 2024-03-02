package com.faction.elements.results;

import java.util.List;

import com.faction.elements.Assessment;
import com.faction.elements.Vulnerability;

import java.util.ArrayList;

public class AssessmentManagerResult {

	private Assessment assessment;
	private List<Vulnerability> vulnerabilities;

	/**
	 * Gets the current assessment
	 * 
	 * @return assessment
	 */
	public Assessment getAssessment() {
		return this.assessment;
	}

	/**
	 * Sets the updated assessment
	 * 
	 * @param assessment
	 */
	public void setAssessment(Assessment assessment) {
		this.assessment = assessment;
	}

	/**
	 * Get a list of Vulnerabilities for the assessment
	 * 
	 * @return List of vulnerabilities
	 */
	public List<Vulnerability> getVulnerabilities() {
		return this.vulnerabilities;
	}

	/**
	 * Set and updated list of vulnerabilities
	 * 
	 * @param vulnerabilities
	 */
	public void setVulnerabilities(List<Vulnerability> vulnerabilities) {
		this.vulnerabilities = vulnerabilities;
	}

}
