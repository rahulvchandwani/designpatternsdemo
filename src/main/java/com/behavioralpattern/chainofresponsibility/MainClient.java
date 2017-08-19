package com.behavioralpattern.chainofresponsibility;

public class MainClient {
	
	public static void main(String[] args) {
		CourtCase courtCaseInSupreme = new CourtCase("Criminal", CaseLevel.SUPREME);
		
		CourtChain districtCourt = new DistrictCourt();
		CourtChain highCourt = new HighCourt();
		CourtChain supremeCourt = new SupremeCourt();
		
		districtCourt.delegateToNextCourt(highCourt);
		highCourt.delegateToNextCourt(supremeCourt);
		
		districtCourt.handleCase(courtCaseInSupreme);
	}
}
