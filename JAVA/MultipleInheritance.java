interface Emp{
 void work();
}
interface dep{
	void maneger();
}
interface client{
	void call();
}

class office implements Emp,dep,client
{
	public  void work() {
		System.out.println("i am Employee");
	}
	public  void maneger() {
		System.out.println("i am maneger");
	}
	public  void client() {
		System.out.println("i am client");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		office o = new office();
		o.work();
		o.maneger();
		o.client();
		// TODO Auto-generated method stub

	}

}
