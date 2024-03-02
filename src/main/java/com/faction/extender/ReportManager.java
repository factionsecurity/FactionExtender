package com.faction.extender;

import java.util.List;

import com.faction.elements.Assessment;
import com.faction.elements.Vulnerability;

public interface ReportManager extends BaseInterface {
	
	/**
	 * reportCreate is fired when ever an assessment report is created.  
	 * 
	 * 
	 * @param assessment 		is the Current assessment
	 * @param vulns 	is the list of vulnerabilities that is related to this assessment. Will be 
	 * 					null if the Operation is Create. 
	 * @param reportText text from the report before it is converted to a docx file. 
	 * 
	 * @return updated reportText. If the repsonse is null then the report is not updated.  
	 */
	public String reportCreate(Assessment assessment, List<Vulnerability> vulns, String reportText);
}
