package MYP_4B;

public class Oddevensum {
	int limitone = 1, limittwo= 10;
	int sumodd = 0;
	int sumeven = 0;
	int number = limitone;
	public static void main(String args[])
	{
		Oddevensum obj=new Oddevensum();
	
		//logic
		while(obj.number<=obj.limittwo)
		{
			if(obj.number%2==0)
			{
				//even number
				obj.sumeven = obj.sumeven+ obj.number;
			}//if end
			else 
			{
				//odd number
				obj.sumodd = obj.sumodd + obj.number;
			}//else end
			obj.number++; //next number
		}//while
		
		
		//print the result
		System.out.println("The sum of odd numbers from " + obj.limitone + " to " + obj.limittwo+ " is " + obj.sumodd);
		System.out.println("The sum of even numbers from " + obj.limitone + " to " + obj.limittwo + " is " + obj.sumeven);
		System.out.println("The difference between the two sums is " + (obj.sumeven - obj.sumodd));
		
				
	}// end main


}// end class
