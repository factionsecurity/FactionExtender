package com.faction.interfaces;

import java.util.Date;
import java.util.List;

public abstract class _Verification {
	public abstract _User getAssessor();
	public abstract void setAssessor(_User assessor);
	public abstract _User getAssignedRemediation();
	public abstract void setAssignedRemediation(_User assignedRemediation);
	public abstract Long getId();
	public abstract void setId(Long id);
	public abstract _Assessment getAssessment();
	public abstract void setAssessment(_Assessment assessment);
	public abstract Date getStart();
	public abstract void setStart(Date start);
	public abstract Date getEnd();
	public abstract void setEnd(Date end);
	public abstract Date getCompleted();
	public abstract void setCompleted(Date completed);
	public abstract List<_CustomField> getCustomFields() ;
	public abstract void setCustomFields(List<_CustomField> customFields) ;
	public abstract String getNotes() ;
	public abstract void setNotes(String notes) ;
	public abstract Date getRemediationCompleted() ;
	public abstract void setRemediationCompleted(Date remediationCompleted) ;
	public abstract String getWorkflowStatus() ;
	public abstract void setWorkflowStatus(String workflowStatus) ;

}
