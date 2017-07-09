package MYP_4B;

public class Swappingprogram {
	//declaration of variable and initialization 
	int a = 20, b = 30, temp = 0;
	public static void main(String args[]) {
		Swappingprogram obj = new Swappingprogram();
		System.out.println( "value of a before swapping "+obj.a);
		System.out.println( "value of b before swapping "+obj.b);
		System.out.println( "-----------------------------------");
		
		
		//logic
		obj.temp = obj.b;
		obj.b = obj.a;
		obj.a = obj.temp;
		
	
		System.out.println( "new value of a "+obj.a);
		System.out.println( "new value of b "+obj.b);
	}
	

}
