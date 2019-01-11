package com.trusohamn.skyline;

import org.junit.Test;
import org.junit.Assert;

public class AppTest {

	@Test
	public void testSolutionExample() {
		 int[]A = {1, 3, 2, 1, 2, 1, 5, 3, 3, 4, 2};
		 Assert.assertEquals(9, App.solution(A));
	}
	
	@Test
	public void testSolutionFlat() {
		 int[]A = {3, 3, 3, 3};
		 Assert.assertEquals(3, App.solution(A));
	}
	
	@Test
	public void testSolutionTall() {
		 int[]A = {5, 8};
		 Assert.assertEquals(8, App.solution(A));
	}
	
	@Test
	public void testSolutionOne() {
		 int[]A = {1};
		 Assert.assertEquals(1, App.solution(A));
	}
	
	@Test
	public void testSolutionMaxTall() {
		 int[]A = {1000000000};
		 Assert.assertEquals(1000000000, App.solution(A));
	}
	
	@Test
	public void testSolutionExceeded() {
		 int[]A = {App.maxStrokesNumber/2, 0, App.maxStrokesNumber/2, 0, 1};
		 Assert.assertEquals(-1, App.solution(A));
	}
	
	@Test
	public void testSolutionMax() {
		 int[]A = {App.maxStrokesNumber/2, 0, App.maxStrokesNumber/2};
		 Assert.assertEquals(App.maxStrokesNumber, App.solution(A));
	}

}
