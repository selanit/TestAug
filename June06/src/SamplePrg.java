	import java.util.Arrays;
public class SamplePrg

{


	
	 
	
	
	
	 
	
	    public static void main(String[] args) {
	
	 
	
	        String str = "abdc:psdv|sdvosdv.dfpbkdd";
	
	 
	
	        // split the array using a single digit, e.g 1,2,3...
	
	        String[] parts = str.split(":");
	
	        System.out.println(Arrays.toString(parts));
	
	        // split the array using a whole number, e.g  12,346,756
	
	        parts = str.split(":+|\\.+|\\|");
	
	        System.out.println(Arrays.toString(parts));
}
}