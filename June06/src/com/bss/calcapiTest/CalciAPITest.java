package com.bss.calcapiTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bss.calciapi.*;

import static org.testng.Assert.*;

public class CalciAPITest {
	CalcAPI_Jun12 calc=new CalcAPI_Jun12();
	
	
	@BeforeMethod
	
	public void setUp()
	{
		System.out.println("Before Method");
	}
	
	
	
  @Test
  public void f() {
	  assertEquals(calc.add(12, 12),24);
  }
  
  
   
  
  
}
