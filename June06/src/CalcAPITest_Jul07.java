 import static org.junit.Assert.*;

import org.junit.Test;


public class CalcAPITest_Jul07 {
	CalcAPI_Jun12 c=new CalcAPI_Jun12();

	@Test
	public void testAdd() {
		
		int res=c.add(12,0);
		
		assertEquals(12,res);
		
	}

	@Test
	public void testMult()
	{
		int res=c.mul(2,0);
		
		assertEquals(0,res);
	}
	
	


}
