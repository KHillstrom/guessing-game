package edu.macalester.cs124.guessing;

public class Player {
	public int guess;
	public void startNewGame(){
		guess = 0;
	}
	
	public int nextGuess(){
		guess++;
		return guess;
	}
	
}
