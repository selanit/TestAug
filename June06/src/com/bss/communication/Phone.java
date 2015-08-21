package com.bss.communication;

public class Phone {

	int number;
	  String make;
	  String model;
	  public int pub=333;
	  protected int prot=10;
	  int def=4444;
	  private int priv=1934;
			   
	  
	  
	  public void dial(int to)
	  {
		  System.out.println("The very first feature of Dialing");
	  }
	  
	  public void receive()
	  {
		  System.out.println("Answering the phone-- the basic feature of phone");
	  }
	
	public static void main(String[] args) {
		
		System.out.println("---------*********** Basic Phone Features ***********----------");
		Phone p=new Phone();
		p.dial(123);
		p.receive();
		System.out.println("Private variable usage "+ p.priv);
		System.out.println(" --------- End of Phone ---------------");
		// TODO Auto-generated method stub
  
   
  
	}

}
