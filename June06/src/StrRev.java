import java.util.Scanner;


public class StrRev {

	public static void main(String[] args) {
		int len,i;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string that needs to be reversed");
		String a=s.next();
	s.close();
		
		len=a.length();
		for( i=len-1;i>=0;i--)
		{
			System.out.print((a.charAt(i)));
		}
	        
			}

		}
