package MYP_4B;
import java.io.*;
public class telecom {


	
	
	long id;
	String name;
	long phno;
	double calls;
	double bill;
	

public void accept()throws IOException{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Your ID:  ");
	id = Long.parseLong(br.readLine());
	System.out.println("Enter Your Name:  ");
	name = br.readLine();
	System.out.println("Enter Your Phone Number:  ");
	phno = Long.parseLong(br.readLine());
	System.out.println("Enter Number of Calls Made:  ");
	calls=Double.parseDouble(br.readLine());	
}

public void calculate(){
	
	if(calls<=100)
		bill=200;
	else if (calls>100 && calls<=150)
  	{
     		calls=calls-100;
     		bill=200+(0.60*calls);
	}
	else if (calls>150 && calls<=200)
	{
		calls=calls-150;
		bill=200+(0.60*50)+(0.50*calls);
 	}
	else
	{
		calls=calls-200;
		bill=200+(0.60*50)+(0.50*50)+(0.40*calls);
	}}

public void display(){
	
	System.out.println("ID:  "+id);
	System.out.println("Name:  "+name);
	System.out.println("Phone Number:  "+phno);
	System.out.println("Number of Calls Made:  "+calls);
	System.out.println("Bill:  "+bill);
	
}

public static void main(String args[]) throws IOException
{
	telecom ob = new telecom();
	ob.accept();
	ob.calculate();
	ob.display();

}

}
