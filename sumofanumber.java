package MYP_4B;

public class sumofanumber {
	int no=123456789 ,sum=0 ,r;
	
	public static void main(String args[]){
		sumofanumber obj=new sumofanumber ();
		while(obj.no>0){
			obj.r=obj.no%10;//to get the last no if the digit
			obj.sum=obj.sum+obj.r;// to add the last no of the digit in the remainder
			obj.no=obj.no/10;// to get the remainding number
		}
		System.out.println("Sum of Digits: "+obj.sum);
		
	}

}
