package com.faction.elements;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import com.faction.elements.User;

import lombok.Data;

/**
 * The Assessment Class is used to store all elements of a Faction Assessment
 */
@Data
public class Assessment {

	private String summary;
	private String riskAnalysis;
	private String name;
	private User engagementContact;
	private List<User> assessors;
	private User remediationContact;
	private String appId;
	private Date start;
	private Date end;
	private Date completed;
	private String Notes;
	private String DistributionList;
	private String AccessNotes;
	private String type;
	private byte[] finalReport;
	private String campaign;
	private String pr_sum_notes;
	private String pr_risk_notes;
	private String status;
	private Integer workflow;
	private List<CustomField> customFields;
	private List<CheckList> checklists;
	
}
