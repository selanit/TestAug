 //package samplepack;

import java.io.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXML {
	

	public String XMLDataFile="C:/Users/Anitha/workspace/June06/src/work.xml";
	public String sComp;
	public String testCaseDescription, included, ignoreReason, UserName, password;
	
	public static void main (String args[])
	{
		ReadXML rp = new ReadXML();
		try {
			//rp.readInfo();
			rp.readXML("SGN-0003");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(rp.testCaseDescription);		
	}
	

	public void readXML(String testID) throws Exception{
        String testCaseNumber = testID;
        File file = new File(XMLDataFile);
        
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);
        doc.getDocumentElement().normalize();
        	
        NodeList nodeLst = doc.getElementsByTagName("Test");
        
          for (int s = 0; s < nodeLst.getLength(); s++) {
            Node fstNode = nodeLst.item(s);         
            if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
                Element testElmnt = (Element) fstNode;
                String id = testElmnt.getAttribute("id");
                if(id.equals(testCaseNumber))  {
                	NodeList testDescriptionList = testElmnt.getElementsByTagName("userName");
                	String n= testDescriptionList.item(0).getChildNodes().item(0).getNodeValue();
                	
                	System.out.println(n);
                	//Element desc=(Element)testDescriptionList.item(0);
                	//System.out.println("Child Desc count: " + desc.getElementsByTagName("ChildDesc1").getLength());
                	//System.out.println("first read "+n);
        	       
                	
              
                }
            }
       }
    }
	  
}
