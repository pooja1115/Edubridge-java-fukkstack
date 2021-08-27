package com.inter;
interface x
{
	void show();
}
class emp implements x
{
	public void show()
	{
		System.out.println("Learning interface");
	}
	
}

public class InterfaceEx {

	public static void main(String[] args) {
   emp  s = new emp();
   s.show();

	}

}
