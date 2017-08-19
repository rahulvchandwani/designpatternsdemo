package com.behavioralpattern.chainofresponsibility;

public enum CaseLevel {
	DISTRICT("District"), HIGH("High"), SUPREME("Supreme");
	
	private String level;
	
	private CaseLevel(String level) {
		this.level = level;
	}
	
	public String getLevel() {
		return level;
	}
	
	public static CaseLevel getEnumByStatus(String level) {
		CaseLevel[] values = CaseLevel.values();
		CaseLevel responseLevel = null;
		
		for(CaseLevel value : values) {
			if(value.getLevel().equals(level)) {
				responseLevel = value;
			}
		}
		
		return responseLevel;
	}
}
