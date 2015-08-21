import static org.junit.Assert.*;

import org.junit.Test;


public class StringOccurFuncTest {

	StringOccurFunc test=new StringOccurFunc();
	int cnt;
	
	@Test
	public void testonce()
	{
		 cnt=test.StringCnt("Hello world hello hello", "world");
		 assertEquals(1,cnt);
	}
	
	@Test
	public void testtwice() {
		
		// cnt=test.StringCnt("This is my is is", "is"); // not working
		// cnt=test.StringCnt("This is my this is my", "This");
		// cnt=test.StringCnt("This by my this by my", "by   ");
		assertEquals(2,cnt);
		
	}
	@Test
	public void testthrice()
	{
	 cnt=test.StringCnt("Hello my name is anitha anitha anitha", "anitha");
	assertEquals(3,cnt);	
	}

}
