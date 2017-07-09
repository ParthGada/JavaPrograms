package MYP_4B;
import java.io.*;
public class Arrayuserinput {
	int[] numbers = new int[5];
	public static void main(String[]args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Arrayuserinput obj=new Arrayuserinput();
		
		System.out.println("enter the first elements in the array of numbers ");
		obj.numbers[0] = Integer.parseInt(br.readLine());
		
		System.out.println("enter the second elements in the array of numbers ");
		obj.numbers[1] = Integer.parseInt(br.readLine());
		
		System.out.println("enter the third elements in the array of numbers ");
		obj.numbers[2] = Integer.parseInt(br.readLine());
		
		System.out.println("enter the fourth elements in the array of numbers ");
		obj.numbers[3] = Integer.parseInt(br.readLine());
		
		System.out.println("enter the fifth elements in the array of numbers ");
		obj.numbers[4] = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i < obj.numbers.length ; i++){
			System.out.println(obj.numbers[i]);
			
		}
		
		
	}
	
	
	

}
