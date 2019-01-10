package junitTest.TestCase;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junitTest.logic.Calculation;

public class TestCase1 {
	@BeforeClass
	public static void setUpBefore() throws Exception {
		System.out.println("before class");
	}

	@Before
	public  void setUp() throws Exception {
		System.out.println("before");
	}

	@Test
	public void testFindMax() {
		System.out.println("test case max");
		assertEquals(4, Calculation.findMax(new int[] { 1,3,4,2 }));
		assertEquals(0,Calculation.findMax(new int[]{-12,0,-3,-4,-2})); 
		
		
}
	@Test
	public void testAdd() {
		System.out.println("test case add");

		assertEquals(5,Calculation.Add(2, 3));
	}

	@After
	public void setDown() throws Exception {
		System.out.println("after");

	}

	@AfterClass
	public static void  setDownBeforeClass() throws Exception {
		System.out.println("after class");
	}
}
