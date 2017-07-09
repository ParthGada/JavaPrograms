package MYP_4B;
//addition program using object concept
public class additionobject {
	// variable declaration and initialization
	int a = 5, b = 20, sum = 0;
	public static void main(String args[]) {
		// creating object of class additionobject
		additionobject obj = new additionobject();
		//logic
		obj.sum = obj.a + obj.b;
		
		System.out.println("Addition " + obj.sum);
	}
	
	
	

}
