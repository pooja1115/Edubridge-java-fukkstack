package com.abst;

abstract class Data{
	abstract void sum();
	void show()
	{
		System.out.println("Crating abstract class");
	}
}

 public class  Abstraction extends Data{
	
	void sum() 
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println("sum : " +c);
	}



	public static void main(String[] args) { 
		
		Abstraction  a =new Abstraction();
	a.sum();
	a.show();

	}

}

