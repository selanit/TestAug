package com.bss.communication;

public class iPhone extends SmartPhone{
    public void itunes()
    {
    	System.out.println("Introducing iTunes");
    }
    
    public void siri()
    {
    	System.out.println("Get instant help without unlocking ur iphone -- SIRI");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" iPhone Class --Starting");
		iPhone i=new iPhone();
		i.receive();
		i.dial(1234);
		i.itunes();
		i.siri();
		i.make="iPhone";
		i.model= "iPhone 6s";
		
		System.out.println("Default " + i.def + " Prot"+ i.prot + "  public "+ i.pub +"  ");
		
		System.out.println(i.make + "-------" + i.model);
		System.out.println("iPhone Class -- ending ");
		

	}

}
