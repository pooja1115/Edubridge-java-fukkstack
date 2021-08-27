interface A{
	void info();
	interface B
	{
		void info_one();
	}
}

class Nested implements A
{
	public void info()
	{
		System.out.println(" interface A");
	}
	public void info_one()
	{
		System.out.println(" interface B");	
	}
}


public class NestedInterface {

	public static void main(String[] args) {
	Nested N =new Nested();
	N.info();
	N.info_one();

	}

}
