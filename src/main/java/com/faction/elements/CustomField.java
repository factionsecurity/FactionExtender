package com.faction.elements;


/**
 * Class to represent faction custom fields
 */
public class CustomField {
	

	private Long id;

	private CustomType type;
	private String value;
	public Long getId() {
		return id;
	}
	public CustomType getType() {
		return type;
	}
	public String getValue() {
		return value;
	}

	public void setType(CustomType type) {
		this.type = type;
	}
	public void setValue(String value) {
		this.value = value;
	}

	
	
	
	
	
	
	
	
	

}
