package com.behavioralpattern.memento;

import java.util.LinkedHashSet;
import java.util.Set;

public class CareTaker {
	private Set<Backup> backups = new LinkedHashSet<>();
	
	public Backup getLatestBackup() {
		// Return the latest added backup
		return backups.stream().skip(backups.size()-1).findFirst().get();
	}
	
	public void addBackup(Backup backup) {
		backups.add(backup);
	}
}
