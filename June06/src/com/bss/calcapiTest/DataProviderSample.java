package com.bss.calcapiTest;
import com.bss.calciapi.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DataProviderSample {
	
	
	CalcAPI_Jun12 calci=new CalcAPI_Jun12();
	
	@DataProvider(name="testdata")
	
	public Integer[][] myData()
	{
		return new Integer[][]
				{
				{0,0,0},
				{1,1,1},
				{2,1,0},
				{3,2,1},
	
				};
	}
	
	@Test (dataProvider="testdata")



	  //public void testAdd(Integer exp, Inputs i) {

	  public void testAdd(Integer exp, int a, int b) {

	// Inputs ip= (Inputs)i;

	  //assertEquals( exp, (Integer) cal.add(i.val1,i.val2));

	  assertEquals( exp, (Integer) calci.add(a,b));

	  //fail("expected exceotion didn't occur");

	  //assertTrue(false);

	  }

	  

	  

	  @DataProvider

	  public String[][] simpleData()

	  {

	  String[][] data= new String[][]{

	  {"california", "CA"},

	  {"NewYork", "NY"},

	  {"Illinois", "IL"}

	      };

	 

	  return data;

	  }

	  

	  @Test(dataProvider="simpleData")

	  public void testSimple(String s, String t)

	  {

	  System.out.println("First input is " +s+" and second input is "+t);

	  }

	  

	}



	 class Inputs{

	int val1, val2;

	Inputs(int a, int b)

	{

	val1=a;

	val2=b;

	}
	
	
}
