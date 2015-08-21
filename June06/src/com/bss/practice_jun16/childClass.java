package com.bss.practice_jun16;

public class childClass extends parClass1{

	public void method1()
	{
		System.out.println(" Im a child class -- method1");
	}
	
	public void method3()
	{
		System.out.println("Im in child class -- method2");
	}

	
	public static void main(String args[])
	{
		childClass c= new childClass();
		parClass1 p=new parClass1();
				
		p.method1();
		c.method1();
		c.method2();
		c.method3();
		
	}
	
}

