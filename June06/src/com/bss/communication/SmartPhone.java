package com.bss.communication;

public class SmartPhone extends Phone{

	public void radio()
	{
		System.out.println(" Radio Feature Introduced in smart phones");
	}
	
	public void sms()
	{
		System.out.println("Introducing the brand new messaging service");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone s= new SmartPhone();
System.out.println(" ----------- Phone Class---------- beginning");
		s.radio();
		s.dial(123);
		s.receive();
		s.sms();
	System.out.println("Default " + s.def + " Prot"+ s.prot + "  public "+ s.pub +"  ");
		System.out.println(" ----------- Phone Class---------Closing");		

	}

}
