package com.bridgelabz;

class MoodAnalysisException extends NullPointerException{

	public MoodAnalysisException() {
		super();
		
	}
	public MoodAnalysisException(String s) {
		super(s);
		
		}
	}
 public class MoodAnalyzerMain {
	
	private String message = "Null";
	 
	public MoodAnalyzerMain() {
		
	}
	
	public MoodAnalyzerMain(String message) {
		this.message = message;
	}

 public String returnEmotion() throws MoodAnalysisException {
	 try {
		 if(message.contains( "sad")) {
			return "sad";
		}
		
		 else if(message.contains("any") || message.contains("happy")) {
			return "Happy";
		}
		
		 else if(message.equals("Null")) {
			throw new MoodAnalysisException();	
		}
		
		 else if (message != null) {
			return "Happy";
		}
		
	 } catch (MoodAnalysisException e) {
			System.out.println("Exception is handled");
			return "Happy";
			
		}
	 	return message;	
 	}	
	
 }
