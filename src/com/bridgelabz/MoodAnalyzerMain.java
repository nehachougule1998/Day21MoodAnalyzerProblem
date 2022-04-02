package com.bridgelabz;

public class MoodAnalyzerMain {
	
	private String message;
	 
	public MoodAnalyzerMain() {
		
	}
	
	public MoodAnalyzerMain(String message) {
		this.message = message;
	}

 public String returnEmotion() {
	 try {
		if(message.equals( "I am in sad mood")) {
			return "sad";
		}
		else if(message.equals("I am in any mood")) {
			return "Happy";
		}
		
	 } catch (NullPointerException e) {
			System.out.println(e);
			return "Happy";
		}
	   return message;
 	}	
	
	}
