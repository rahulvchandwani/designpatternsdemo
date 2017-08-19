package com.behavioralpattern.chainofresponsibility;

public interface CourtChain {
	
	void delegateToNextCourt(CourtChain nextCourt);
	
	void handleCase(CourtCase courtCase);
}
