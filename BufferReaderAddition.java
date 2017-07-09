package MYP_4B;

import java.io.*;

public class BufferReaderAddition {
	public static void main(String[]args) throws Exception{
		float a,b,c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first number to add");
		a=Float.parseFloat(br.readLine());
		System.out.println("Enter the second number to add");
		b=Float.parseFloat(br.readLine());
		System.out.println("press enter to add");
		c=a+b;
		System.out.println("addtion of two numbers is: " + c);
				
		
	}

}
