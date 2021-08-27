package com.inter;

interface print
{
	void show();
	default void msg(){
	System.out.println("Using default interface in java 8");	
	}
}

class data implements print
{
	public void show()
	{
		System.out.println("I am in data class");	
	}
}

public class InterfaceEx1 {

	public static void main(String[] args) {
		data d = new data();
		d.show();
		d.msg();

	}

}
