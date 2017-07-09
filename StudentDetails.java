package MYP_4B;
import java.io.*;
public class StudentDetails {
//data members
	int[] rollno = new int[5];
	String[] student_name = new String[5];
	

public void input()throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter 2 students name:  ");
	student_name[1]=br.readLine();
	student_name[2]=br.readLine();
	System.out.println("Enter roll number of 2 students:  ");
	rollno[1]=Integer.parseInt(br.readLine());
	rollno[2]=Integer.parseInt(br.readLine());
}
public void display(){
	System.out.printf("\n Student names: %s %s",student_name[1], student_name[2] );
	System.out.println("\n----------------------------------------------------");
	System.out.printf("\n Roll NO: \n %s %s",rollno[1],rollno[2]);
	System.out.println("\n----------------------------------------------------");
}
public static void main(String args[])throws IOException{
	StudentDetails obj = new StudentDetails();
	obj.input();
	obj.display();
	
	
}
}