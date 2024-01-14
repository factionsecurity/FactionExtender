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
		
		AssessmentManagerResult result = asmtMgr.assessmentChange(asmt, vulns, Operation.Create);
		
		assertTrue(result.getAssessment().getSummary().equals("This is a test"));
		
		assertTrue(asmtMgr.getLogs().size() == 2);
		
		List<Log> logs = asmtMgr.getLogs();
		assertTrue(logs.stream().anyMatch( log -> log.getMessage().equals("Got Config1: Test Config 1")));
		assertTrue(logs.stream().anyMatch( log -> log.getMessage().equals("Got Config2: Test Config 2")));
		
		
		
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
			
			AssessmentManagerResult result = new AssessmentManagerResult();
			result.setAssessment(asmt);
			result.setVulnerabilities(vulns);
			return result;
		}
	}

}


