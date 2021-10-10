package by.epam.boiko.homework;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FunctionTest {

	public static final NumberList testNumberList = new NumberList(1, 2, 3);

	@Test
	public void comparisonMin() {
		int minNumber = 1;
		assertEquals(minNumber,testNumberList.comparisonMin(testNumberList));
	}
	
	@Test
	public void comparisonMax() {
		int maxNumber = 3;
		assertEquals(maxNumber, testNumberList.comparisonMax(testNumberList));
	}
	
	@Test 
	public void sumMinAndMax() {
		int sum = 1+3;
		assertEquals(sum,testNumberList.sumMinAndMax(testNumberList));
	}
}
