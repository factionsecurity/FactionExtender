package com.faction.unittests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ServiceLoader;

import org.junit.jupiter.api.Test;

import com.faction.elements.Assessment;
import com.faction.elements.BaseExtension;
import com.faction.elements.CheckList;
import com.faction.elements.CheckListItem;
import com.faction.elements.Vulnerability;
import com.faction.elements.results.AssessmentManagerResult;
import com.faction.elements.utils.Log;
import com.faction.elements.utils.Log.LEVEL;
import com.faction.extender.AssessmentManager;
import com.faction.extender.AssessmentManager.Operation;



public class ExtenderTestCase {

	@Test
	void test() {
		AssessmentManager asmtMgr = new MyAssmtMgr();
		HashMap<String,String>configs = new HashMap<>();
		configs.put("Test1", "Test Config 1");
		configs.put("Test2", "Test Config 2");
		
		asmtMgr.setConfigs(configs);
		
		Assessment asmt = new Assessment();
		asmt.setSummary("Default");
		
		Vulnerability vuln = new Vulnerability();
		List<Vulnerability> vulns = new ArrayList<>();
		vulns.add(vuln);
		
		CheckList checklist = new CheckList();
		CheckListItem item1 = new CheckListItem();
		item1.setNotes("note1");
		item1.setQuestion("question1");
		item1.setAnswer(CheckListItem.Answer.Fail);
		CheckListItem item2 = new CheckListItem();
		item2.setNotes("note2");
		item2.setQuestion("question2");
		item2.setAnswer(CheckListItem.Answer.Pass);
		
		checklist.setName("checklist1");
		checklist.setCheckListItems(new ArrayList<>());
		checklist.getCheckListItems().add(item1);
		checklist.getCheckListItems().add(item2);
		
		asmt.setChecklists(new ArrayList<>());
		asmt.getChecklists().add(checklist);
		
		
		
		
		AssessmentManagerResult result = asmtMgr.assessmentChange(asmt, vulns, Operation.Create);
		
		assertTrue(result.getAssessment().getSummary().equals("This is a test"));
		
		assertTrue(asmtMgr.getLogs().size() == 3);
		
		List<Log> logs = asmtMgr.getLogs();
		assertTrue(logs.stream().anyMatch( log -> log.getMessage().equals("Got Config1: Test Config 1")));
		assertTrue(logs.stream().anyMatch( log -> log.getMessage().equals("Got Config2: Test Config 2")));
		assertTrue(logs.stream().anyMatch( log -> log.getMessage().equals("Got Checklist: checklist1")));
		
		
		
		assertTrue(true);
		
	}
	
	public class MyAssmtMgr extends BaseExtension implements AssessmentManager{

		@Override
		public AssessmentManagerResult assessmentChange(Assessment asmt, List<Vulnerability> vulns,
				Operation Operation) {
			String config1 = this.getConfigs().get("Test1");
			String config2 = this.getConfigs().get("Test2");
			
			asmt.setSummary("This is a test");
			
			this.getLogger().addLog(LEVEL.INFO, "Got Config1: " + config1);
			this.getLogger().addLog(LEVEL.INFO, "Got Config2: " + config2);
			
			this.getLogger().addLog(LEVEL.INFO, "Got Checklist: " + asmt.getChecklists().get(0).getName());
			
			AssessmentManagerResult result = new AssessmentManagerResult();
			result.setAssessment(asmt);
			result.setVulnerabilities(vulns);
			return result;
		}

	}
	

}


