import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Orbitz {
    public static void main(String[] args) {
        //Open Browser
                WebDriver wd = new FirefoxDriver();
                
                String destcity[] = {"DFW","PHX"};
                double price[] = new double [2];
                
                
            for (int i=0; i<=1; i++){
                wd.get("http://www.orbitz.com");
                
                //Enter to and from city
                
                wd.findElement(By.xpath("//input[@name='search.type']")).click();
                wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                wd.findElement(By.name("ar.rt.leaveSlice.orig.key")).clear();
                wd.findElement(By.name("ar.rt.leaveSlice.orig.key")).sendKeys("SFO");
                wd.findElement(By.name("ar.rt.leaveSlice.dest.key")).clear();
                wd.findElement(By.name("ar.rt.leaveSlice.dest.key")).sendKeys(destcity[i]);
                                
                //Enter to and from date
                
                wd.findElement(By.name("ar.rt.leaveSlice.date")).clear();
                wd.findElement(By.name("ar.rt.leaveSlice.date")).sendKeys("8/21/15");
                wd.findElement(By.name("ar.rt.returnSlice.date")).clear();
                wd.findElement(By.name("ar.rt.returnSlice.date")).sendKeys("9/15/15");
                
                //Enter Search        
                
                wd.findElement(By.name("search")).click();
                wd.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
                price[i] = Double.parseDouble(wd.findElement(By.xpath("//span[@class='money small-cents small-symbol']")).getText().replace("$",""));
                System.out.println("The lowest price from SFO to "+ destcity[i]+ " is " + price[i]);
            }
                
                if (price[0] > price[1])
                {
                    System.out.println("Go to PHX");
                }
                
                    else
                        System.out.println("Go to DFW"); 
                }    
    }