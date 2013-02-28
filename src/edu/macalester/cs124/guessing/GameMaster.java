package edu.macalester.cs124.guessing;

import java.util.Random;

public class GameMaster {
	public static int LOW = 0;
	public static int HIGH = 100;
	public int numb;
	public int guesses = 0;
	
	private final Random rand = new Random();
	
	public void startNewGame(){
		numb = rand.nextInt(HIGH);
	} 
	
	public int submitGuess(int guess){
		guesses++;
		if(guess < numb){
			return LOW;
		}
		else if (guess > numb){
			return HIGH;
		}
		return HIGH + 1;
	}
	
	public int getGuessCount(){
		return guesses;
	}
}
