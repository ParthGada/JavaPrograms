package MYP_4B;
import java.io.*;

public class Salary {
	// Data members
	 String name;
	String address;
	long phone;
	String subject;
	double msalary;
	double itax;
	
	//method to input values
	public void accept()throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name");
		name=br.readLine();
		System.out.println("Enter Address");
		address=br.readLine();
		System.out.println("Enter phone number");
		phone=Long.parseLong(br.readLine());
		System.out.println("Enter subject");
		subject=br.readLine();
		System.out.println("Enter monthly salary");
		msalary=Double.parseDouble(br.readLine());
	}
		
		
	
	//method to display values
	public void display()
	 { 
        System.out.println("Name             	: "+name); 
        System.out.println("Address         	: "+address);
        System.out.println("Phone            	: "+phone); 
        System.out.println("Subject          	: "+subject);
        System.out.println("Monthly salary  	: "+msalary);
        System.out.println("Income Tax      	: "+itax);
    }
    
    //method to compute salary
    public void compute()
    {
        double asalary=msalary*12;
        if(asalary>175000)
            itax=(asalary-175000)*5.0/100.0;
        else
            itax = 0.0;
    }
    
    //main method to call methods using object of class Salary
    public static void main(String args[])throws IOException
    {
    	
        Salary ob=new Salary();
        ob.accept();
        ob.compute();
        ob.display();
    }
}


	


