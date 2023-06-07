package seleniumpractice;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exercise2Demo {
	boolean isNumeric(String s){
		try {
			Integer.parseInt(s);
			return true;
		}catch(NumberFormatException e)
		{
			return false;
		}
		
	
	}
	
	@DataProvider(name = "data")
	Object[][] data() {
		//+ve tests
		return new Object [][] {
			{"1000"},
			{"6"}
		};
	
	}
	@Test(dataProvider = "data")
	void isNumericTest(String input) {  
		Assert.assertTrue(isNumeric(input));
	}

	@DataProvider(name = "invalid-data")
	Object[][] invalidData() {
		//-ve tests
		return new Object [][] {
		{"abc"},
		{"abc123"},
		{""},
	  {"21474836479"},
		{"123.23"}
		
};
	}

	@Test(dataProvider = "invalid-data")
	void isNumericTestWithInvalidData(String input) { 
		Assert.assertFalse(isNumeric(input));
	}
	
}