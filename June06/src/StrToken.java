import java.util.Arrays;
import java.util.StringTokenizer;


public class StrToken {

	
	public static void main(String[] args) {
		
	
	String assetClasses = "Gold:Stocks:Fixed Income:Commodity:Interest Rates";
	String assetClasses1 = "Gold:Stocks::+,Fixed Income:\\Commodity:Interest Rates";
	String[] splits = assetClasses.split(":");

	System.out.println("splits.size: " + splits.length);


	   System.out.println(Arrays.toString(splits));
	
	   /*	for(String asset: assetClasses)
	{
	System.out.println(asset);
	}
*/

	   // --------------- String Tokenizer-----------------------
	   
	   System.out.println(" ----------- Using String Tokenizer Class");
	   StringTokenizer stringtokenizer = new StringTokenizer(assetClasses1, "[:,.+\\]");
	   while (stringtokenizer.hasMoreElements()) {
	   System.out.println(stringtokenizer.nextToken());
	   }


	
}

}