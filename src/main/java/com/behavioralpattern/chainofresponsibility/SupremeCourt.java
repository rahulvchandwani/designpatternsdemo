package com.behavioralpattern.chainofresponsibility;

public class SupremeCourt implements CourtChain {
	
	private CourtChain nextCourt;

	@Override
	public void delegateToNextCourt(CourtChain nextCourt) {
		this.nextCourt = nextCourt;
	}

	@Override
	public void handleCase(CourtCase courtCase) {
		System.out.println("Hearing going on in Supreme court.");
		if(courtCase != null) {
			if(courtCase.getCaseLevel() == CaseLevel.SUPREME) {
				System.out.println("Case solved in supreme court");
			} else {
				System.out.println("This case does not belong here. Delegating to next court.");
				this.nextCourt.handleCase(courtCase);
			}
		}
	}
}
