
public class StringOccurFunc {
	
	public int StringCnt(String st, String find)
	{
		String str=st;
		 String a[]=str.split(" ");
			//System.out.println("Length of the string "+str.length());
			int counter=0;
			String temp="";
			for(int i=0;i<a.length;i++)
			{ 
				counter=0;
			
				for(int j=0;j<a.length;j++)
				{
					if(a[i].equals(a[j])&& temp.indexOf(a[i])==-1)
							{
						  counter++;
						  
							}
				}
					if(temp.indexOf(a[i])==-1)
					{
						temp=temp+" "+a[i];
					
					}
				
					if (a[i].equals(find))
						return counter;
					
				
			}
//			counter=0;
			return counter;


	}
}
