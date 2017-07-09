package MYP_4B;

public class B extends A{
	public void b(){
		System.out.println("child class method");
	}
	public static void main(String args[]){
		B obj=new B();
		obj.a();
		obj.b();
	}

}
