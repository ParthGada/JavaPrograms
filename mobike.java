package MYP_4B;
import java.io.*;

public class mobike {
	//data members
	int bikeno;
	long phoneno;
	String name;
	int days;
	int charge;

 public void input()throws IOException
 {
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter Bike number");
	 bikeno=Integer.parseInt(br.readLine());
	 System.out.println("Enter phone number");
	 phoneno=Long.parseLong(br.readLine());
	 System.out.println("Enter name");
	 name=br.readLine();
	 System.out.println("Enter number of days");
	 days=Integer.parseInt(br.readLine());
	 
	 
 }
 public void display(){
 System.out.println("Bike number\tPhone number\tName\tNumber of days\tCharge "); 
 System.out.println("-----------------------------------------------------------------------------");
 System.out.println(bikeno+"\t\t"+phoneno+"\t"+name+"\t\t"+days+"\t"+charge);
System.out.println("------------------------------------------------------------------------------");

}
 public void compute(){
	 if(days==5)
		 charge=days*500;
	 else if(days<=10)
		 charge=5*500+(days-5)*400;
	 else
		 charge=5*500+5*400+(days-10)*200;
 }
 public static void main(String args[])throws IOException{
	 mobike ob=new mobike();
	 ob.input();ob.compute();
	 ob.display();
 }
}