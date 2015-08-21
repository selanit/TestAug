import java.util.Scanner;


public class StringOccur {
	
	public static void main(String args[])
	{
		StringOccurFunc occ=new StringOccurFunc();
		
		System.out.println("Enter the string to be checked");;
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println("Enter the string to be found");;
		Scanner s1=new Scanner(System.in);
		String str1= s1.next();
		 int times=occ.StringCnt(str , str1);
		 System.out.println(str1 + " is found "+ times +" time/times in the string");
		
	}

}
