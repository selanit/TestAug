package com.bss.calcapiTest;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bss.calciapi.*;

import static org.testng.Assert.*;

public class CalciAPITestNG_Jul11 {
  
CalcAPI_Jun12 calc= new CalcAPI_Jun12();	
double a=4.0D;
double b=4.01D;

@BeforeMethod
public void setUp()
{
	System.out.println("------------------Before method----------------------------");
}

@AfterMethod
public void teardown()
{
	System.out.println("-------------------------After Method---------------------------");
}
@Test (groups="abcd")
  public void f() {
	System.out.println("----------------------Inside f() method-------------------------------");
	assertEquals (calc.add(12, 12),24);
	
  }

@Test (groups="abcd")
public void testMult()
{
	System.out.println("--------------------------Inside testMult()------------------------------------");
	assertEquals(calc.mul(4, 1), 4);
	fail("------------------------Testing fail method usage-----------------------");
}

@Test(dependsOnMethods={"testMult","f"}, groups="kjdjkds", priority=1, enabled=false, alwaysRun=true)
public void testMultZero()
{
	System.out.println(" -------------------------Inside testMultZero--------------------------");
	assertEquals(calc.add(4, 0), 4.0D);
}

}

