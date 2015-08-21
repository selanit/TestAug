import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
     SoftAssert s_assert = new SoftAssert();
     @Test    
        //In this method, If any assertion fails then execution will be aborted.
           public void hard_assert_text() {
           Assert.assertEquals("Jyothi", "Sanju");
           System.out.println("Hard Assertion -> 1st assertion executed.");
           Assert.assertEquals("Sanju", "Samhi");
           System.out.println("Hard Assertion -> 2nd assertion executed."); 
          }
          
          @Test
           //In this method, Test execution will not abort even If any assertion fail.
           //Full Test will be executed.
           public void soft_assert_text() {
           s_assert.assertEquals("Jyothi", "Anitha");
           System.out.println("----- First soft assertion executed -------- ");
           s_assert.assertEquals("Pitchu", "Praveen");
           System.out.println("------ SEcond soft assertion executed ---------");
           s_assert.assertAll();
           } 

}