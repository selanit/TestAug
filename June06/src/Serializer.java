import java.io.*;

public class Serializer
{
   public static void main(String [] args)
   {
      Employee e = new Employee();
      e.name = "Praveen Kasireddy";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.SSN = 11122333;
      e.number = 999;
      
      try
      {
         FileOutputStream fileOut =
         new FileOutputStream("anitha.serialize");
         ObjectOutputStream out =
                            new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
          fileOut.close();
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
}