import java.util.Scanner;
public class Calculator {
    public static void main(String args[])
    {
    	CalcAPI_Jun12 cal=new CalcAPI_Jun12();
    	while(true){
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter the first Input Value: ");
    	int a=s.nextInt();
    	
    	System.out.println("Enter the second Input Value: ");
    	int b=s.nextInt();
    	System.out.println("Enter the function that needs to be called : 1=Add  2=Sub 3=Mul 4=Div ");
    	int op=s.nextInt();
    	
    	
        if(op==1)
        System.out.println("The result after adding is  "+cal.add(a,b));
        if(op==2)
            System.out.println("The result after subtracting is  "+cal.sub(a,b));
            
        if(op==3)
            System.out.println("The result after multiplying is  "+cal.mul(a,b));
            
        if(op==4)
            System.out.println("The result after division is  "+cal.div(a,b));
        
        System.out.println("\nDo you want to continue ? Type \"1\" for \"Yes\" or \"0\" for \"No\"");
    int ans=s.nextInt();
         if(ans==1)
        	 continue;
         else
        	 break
        	 ;
         
        	 
    	}
            
    	/**
    	 * @author Anitha
    	 * 
    	 */
    	
    }
    
}

/****
Complete the program

*/