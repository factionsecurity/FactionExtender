package com.faction.elements;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import com.faction.elements.User;
import com.faction.elements.Assessment;
import com.faction.elements.CustomField;


public class Verification {
	
	private Long id;
	private Assessment assessment;
	private Date start;
	private Date end;
	private Date completed;
	private List<CustomField> customFields; 
	private String Notes;
	private User assessor;
	private User assignedRemediation;
	private Date remediationCompleted;
	private String workflowStatus;

	public User getAssessor() {
		return assessor;
	}
	public void setAssessor(User assessor) {
		this.assessor = assessor;
	}
	public User getAssignedRemediation() {
		return assignedRemediation;
	}
	public void setAssignedRemediation(User assignedRemediation) {
		this.assignedRemediation = assignedRemediation;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Assessment getAssessment() {
		return assessment;
	}
	public void setAssessment(Assessment assessment) {
		this.assessment = assessment;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public Date getCompleted() {
		return completed;
	}
	public void setCompleted(Date completed) {
		this.completed = completed;
	}
	public List<CustomField> getCustomFields() {
		return customFields;
	}
	public void setCustomFields(List<CustomField> customFields) {
		customFields = customFields;
	}
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
	}
	public Date getRemediationCompleted() {
		return remediationCompleted;
	}
	public void setRemediationCompleted(Date remediationCompleted) {
		this.remediationCompleted = remediationCompleted;
	}
	public String getWorkflowStatus() {
		return workflowStatus;
	}
	public void setWorkflowStatus(String workflowStatus) {
		this.workflowStatus = workflowStatus;
	}

}
