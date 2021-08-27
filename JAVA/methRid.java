
class A
{
	void show()
	{
		System.out.println("I am in class A");
	}
}
class B extends A{
	void show()
	{
		System.out.println("I am in class B");
	}
	
	
}

class C extends A {
	void show()
	{
		System.out.println("I am in class C");
	}
	
}
public class methRid {

	public static void main(String[] args) {
		A sc = new B();
		sc.show();
		A c =new C();
		c.show();

	}

}
