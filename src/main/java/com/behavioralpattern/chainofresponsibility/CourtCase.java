package com.behavioralpattern.chainofresponsibility;

public class CourtCase {
	
	private String subject;
	private CaseLevel caseLevel;
	
	public CourtCase(String subject, CaseLevel caseLevel) {
		this.subject = subject;
		this.caseLevel = caseLevel;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public CaseLevel getCaseLevel() {
		return caseLevel;
	}

	public void setCaseLevel(CaseLevel caseLevel) {
		this.caseLevel = caseLevel;
	}
	
}
