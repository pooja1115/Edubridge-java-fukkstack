interface A
{
	public void methodA();
			
}
interface B extends  A
{
	public void methodB();
}
interface c extends  A
{
	public void methodc();
}
class  Hybridinheritance implements  B,c{
	public void methodA() {
		System.out.println("calling method A");
	}
	
	public void methodB() {
		System.out.println("calling method B");
	}
	
	
	public void methodc() {
		System.out.println("calling method C");
	}
	
	

	public static void main(String[] args) {
		 Hybridinheritance obj = new  Hybridinheritance();
		 obj.methodA();
		 obj.methodB();
		 obj.methodc();

	}

}
