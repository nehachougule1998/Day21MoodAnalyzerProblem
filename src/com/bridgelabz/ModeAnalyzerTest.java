package com.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ModeAnalyzerTest {

	@Test
	void analysemood() {
		MoodAnalyzerMain moodanalyzer = new MoodAnalyzerMain("I am in any mood");
		assertEquals("Happy",moodanalyzer.returnEmotion());
	}

}
