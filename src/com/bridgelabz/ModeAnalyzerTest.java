package com.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ModeAnalyzerTest {

	@Test
	void analysemood() {
		MoodAnalyzerMain moodanalyzer = new MoodAnalyzerMain();
		assertEquals("Happy",moodanalyzer.returnEmotion());
	}

}
