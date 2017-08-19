package com.behavioralpattern.memento;

// Memento object
public class Backup {
	private int numberOfPhotos;
	private int numberOfSongs;
	
	public Backup(int numberOfPhotos, int numberOfSongs) {
		this.numberOfPhotos = numberOfPhotos;
		this.numberOfSongs = numberOfSongs;
	}
	
	public int getNumberOfPhotos() {
		return numberOfPhotos;
	}
	
	public int getNumberOfSongs() {
		return numberOfSongs;
	}

	@Override
	public String toString() {
		return "Backup [numberOfPhotos=" + numberOfPhotos + ", numberOfSongs=" + numberOfSongs + "]";
	}
	
}
