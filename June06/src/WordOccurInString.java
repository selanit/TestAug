import java.util.StringTokenizer;


public class WordOccurInString {
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("This is my , test my class");


		StringTokenizer st=new StringTokenizer(sb.toString(),",.\\ \n\t",true);

		System.out.println("Lenght of the string "+st.countTokens());
		String arr[]=new String[st.countTokens()];
		
		int count;
		
		
		for(int i=0;i<st.countTokens();i++)
		{
		   arr[i]=st.nextToken();
		   System.out.println("arr[i] "+ arr[i]);
		   for(int j=0;j<st.countTokens();j++)
		   {
			   arr[j]=st.nextToken();
			   System.out.println("arr[j] "+arr[j]);
			   
			   if(arr[i]==arr[j])
			   {
				   System.out.println("Eqauls"+ arr[i]);
			   }
			   
		   }
		   
		  
		  
		   
		}
	}

}
