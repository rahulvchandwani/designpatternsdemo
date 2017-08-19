package com.behavioralpattern.memento;

// Object whose state we want to save
// Originator
public class Data {
	private int numberOfPhotos;
	private int numberOfSongs;
	
	public Data(int numberOfPhotos, int numberOfSongs) {
		this.numberOfPhotos = numberOfPhotos;
		this.numberOfSongs = numberOfSongs;
	}
	
	public void setNumberOfPhotos(int numberOfPhotos) {
		this.numberOfPhotos = numberOfPhotos;
	}
	
	public void setNumberOfSongs(int numberOfSongs) {
		this.numberOfSongs = numberOfSongs;
	}
	
	public Backup saveToBackup() {
		return new Backup(numberOfPhotos, numberOfSongs);
	}
	
	public void restoreFromBackup(Backup backup) {
		this.numberOfPhotos = backup.getNumberOfPhotos();
		this.numberOfSongs = backup.getNumberOfSongs();
	}

	@Override
	public String toString() {
		return "Data [numberOfPhotos=" + numberOfPhotos + ", numberOfSongs=" + numberOfSongs + "]";
	}
	
}
