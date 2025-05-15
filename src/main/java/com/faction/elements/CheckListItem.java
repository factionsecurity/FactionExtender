package com.faction.elements;

import lombok.Data;

@Data
public class CheckListItem {
	
	private String notes;
	private String question;
	private Answer answer;
	
	public static enum Answer { 
		Pass(3), Fail(2), NA(1), Incomplete(0);
		
		private final int value;
	    private Answer(int value) {
	        this.value = value;
	    }

	    public  int getValue() {
	        return value;
	    }
	    public static  Answer getAnswer(int value){
	    	switch(value){
	    	case 0 : return Incomplete;
	    	case 1 : return NA;
	    	case 2 : return Fail;
	    	case 3 : return Pass;
	    	default:
	    		return Incomplete;
	    	}
	    }
		
	}
	

}
