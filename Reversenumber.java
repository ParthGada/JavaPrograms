package MYP_4B;

public class Reversenumber {
	
	//Variable declaration and initialization
	int no=1234567,rev=0,r;
	
	public static void main(String args[]){
	
		//creating class object obj
		Reversenumber obj=new Reversenumber();
		
		//Logic
		while(obj.no>0)
		{
			obj.r=obj.no%10; // remainder
			obj.rev=obj.rev*10+obj.r; // to get reverse number
			obj.no=obj.no/10; // divider will give you the remaining number
		}
		System.out.println("reverse : "+obj.rev);
			
			
	}
	

}
