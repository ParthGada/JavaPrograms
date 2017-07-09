package MYP_4B;

public class Factorial {
	int i, fact=1;
	int a= 4;
	public static void main(String args[]){
		Factorial obj=new Factorial();
		for(obj.i=1; obj.i<=obj.a; obj.i++){
			obj.fact=obj.fact*obj.i;
			}
		System.out.println("Factorial of "+ obj.a+" is: "+obj.fact);
		
		
		
				
	}
	
			
			

}
