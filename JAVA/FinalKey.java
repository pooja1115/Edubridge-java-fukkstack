package com.fin;

class student{
	final void work()
	{
		System.out.println("learn java");
	}
	
}

class college extends student{
	void msg()
	{
		System.out.println("You can start your journey here ");
	}
}

public class FinalKey {

	public static void main(String[] args) {
		college obj =new college();
		obj.work();
		obj.msg();
	

	}

}
