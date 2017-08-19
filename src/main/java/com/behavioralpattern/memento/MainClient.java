package com.behavioralpattern.memento;

public class MainClient {
	public static void main(String[] args) {
		Data data1 = new Data(1,2);
		Backup backup1 = data1.saveToBackup();

		CareTaker careTaker = new CareTaker();
		careTaker.addBackup(backup1);
		
		Data data2 = new Data(4,6);
		Backup backup2 = data2.saveToBackup();

		careTaker.addBackup(backup2);
		
		System.out.println(careTaker.getLatestBackup().getNumberOfPhotos());
	}
}
