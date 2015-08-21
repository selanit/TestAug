package com.bss.calcapiTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bss.calciapi.CalcAPI_Jun12;

public class CalcAPI_Jun12Test_TestNGJul11 {

  @Test
  public void add() {
    
  }

  @Test
  public void mul() {
   
  }
  
  CalcAPI_Jun12 calc= new CalcAPI_Jun12();	
  double a=4.0D;
  double b=4.01D;

  @BeforeMethod
  public void setUp()
  {
  	System.out.println("------------------Before method------------------");
  }

  @Test (groups={"abcd","bc"})
    public void f() {
	  System.out.println("-------------inside f()-----------------");
  	assertEquals (calc.add(12, 12),24);
  	
    }

  @Test (groups="bc")
  public void testMult()
  {
  	assertEquals(calc.add(4, 1), 4.01D);
  	fail("----------------------Testing fail method usage-----------------------------");
  }

  @Test(dependsOnMethods={"testMult","f"}, groups="sanity", priority=1, enabled=false, alwaysRun=true)
  public void testMultZero()
  {
	  System.out.println("----------------testmultzero-----------------");
  	assertEquals(calc.add(4, 0), 4.0D);
  }
}
