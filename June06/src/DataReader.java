



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//import java.sql.SQLException;

import java.util.Properties;



public class DataReader {


public static void main(String[] args) {


String filelocation="C:\\Users\\Anitha\\workspace\\June06\\src\\data.properties";

FileInputStream fis=null;
FileOutputStream fos=null;

try

{

fis= new FileInputStream(filelocation);

Properties prop= new Properties();

prop.load(fis);

System.out.println("URL is "+prop.getProperty("url"));
System.out.println("Name in the file is " + prop.getProperty("name"));

//fos=new FileOutputStream(filelocation);
//Properties prop=new Properties();

//System.out.println("First is "+prop.setProperty("First", "Anitha"));
//System.out.println("Second is "+ prop.setProperty("Second", "Nanjunda"));
//prop.store(fos,null);
}


catch (FileNotFoundException e)
	{
		System.out.println("Oops.. we got wrong file");
	}

catch (IOException e)

	{
		System.out.println("seems properties file is corrupted");
	}


}



}