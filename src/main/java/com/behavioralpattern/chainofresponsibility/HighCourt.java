package com.behavioralpattern.chainofresponsibility;

public class HighCourt implements CourtChain {

	private CourtChain nextCourt;
	
	@Override
	public void delegateToNextCourt(CourtChain nextCourt) {
		this.nextCourt = nextCourt;
	}

	@Override
	public void handleCase(CourtCase courtCase) {
		System.out.println("Hearing going on in high court.");
		if(courtCase != null) {
			if(courtCase.getCaseLevel() == CaseLevel.HIGH) {
				System.out.println("Case solved in high court");
			} else {
				System.out.println("This case does not belong here. Delegating to next court.");
				this.nextCourt.handleCase(courtCase);
			}
		}
	}
}
