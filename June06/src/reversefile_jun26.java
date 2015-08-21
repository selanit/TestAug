import java.io.*;
import java.util.StringTokenizer;
 
public class reversefile_jun26 {
    //line separator. Used system property to prevent cross-OS issues (\n or \r\n)
    private static final String NEW_LINE_SEPARATOR = System.getProperty("line.separator");  
    /**
     * @param args
     */
    public static void main(String[] args) throws IOException, ArrayIndexOutOfBoundsException {
        //read file to buffer
        FileReader input = new FileReader("C:\\Training\\Sample.Txt");
        BufferedReader bufRead = new BufferedReader(input);
 
        StringBuffer rvsWords = new StringBuffer();//String that holds reversed words
        String line;    // String that holds current file line
        //read text from buffer line by line
        line = bufRead.readLine();
        // Read through file one line at time
        while (line != null){
            //apply string tokenizer
            StringTokenizer tok = new StringTokenizer(line, ".,- \t\n\"", true);
            //follow thought each word
            while (tok.hasMoreElements()) {
                //retrieve next word from string tokenizer
                String word = (String)tok.nextElement();
                 
                //put symbols in word in reverse order
                for (int i= word.length()-1; i >=0 ; i--) {
                    rvsWords.append(word.charAt(i));
                }
            }
            //read next line from buffer
            line = bufRead.readLine();
            //if not the last line, we'll put the new line separator
            if (line != null){
                rvsWords.append(NEW_LINE_SEPARATOR);
            }
        }
        bufRead.close();
        //write to output file
        File outFile = new File("C:\\Training\\Sample1.Txt");
        FileWriter writer = new FileWriter(outFile);
        writer.write(rvsWords.toString());
        writer.close();
         
        System.out.println(rvsWords.toString()); //output reverse data to console
         
         
        rvsWords.setLength(0);
    }
}