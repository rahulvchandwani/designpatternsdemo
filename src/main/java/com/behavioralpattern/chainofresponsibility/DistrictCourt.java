package com.behavioralpattern.chainofresponsibility;

public class DistrictCourt implements CourtChain {

	private CourtChain nextCourt;
	
	@Override
	public void delegateToNextCourt(CourtChain nextCourt) {
		this.nextCourt = nextCourt;
	}

	@Override
	public void handleCase(CourtCase courtCase) {
		System.out.println("Hearing going on in District court.");
		if(courtCase != null) {
			if(courtCase.getCaseLevel() == CaseLevel.DISTRICT) {
				System.out.println("Case solved in district court");
			} else {
				System.out.println("This case does not belong here. Delegating to next court.");
				this.nextCourt.handleCase(courtCase);
			}
		}
	}

}
