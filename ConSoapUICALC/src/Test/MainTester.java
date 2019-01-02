package Test;
import org.tempuri.*;

/**
 * MainTester.java
 *
 */
public class MainTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CalculatorTestCase TestClss = new CalculatorTestCase("10");

		try {
			CalculatorTestCase.setVal1(8);
			CalculatorTestCase.setVal2(3);
			TestClss.test2CalculatorSoap12Subtract();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
	}
}
