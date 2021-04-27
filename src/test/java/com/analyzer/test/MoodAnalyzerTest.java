package com.analyzer.test;

import org.junit.Test;
import com.analyzer.utils.MoodAnalyzer;
import static org.junit.Assert.assertEquals;

public class MoodAnalyzerTest {
	
	 @Test
	 public void testAnalyseMood_Shouldreturn_Happy( ) {
			String message="I am in happy Mood";
			String mood=MoodAnalyzer.analyseMood(message);
			assertEquals("HAPPY", mood);	
		
	 }
	 
	 @Test
	 public void testAnalyseMood_Shouldreturn_Sad( ) {
			String message="I am in SAD Mood";
			String mood=MoodAnalyzer.analyseMood(message);
			assertEquals("SAD", mood);	
		
	 }

}
