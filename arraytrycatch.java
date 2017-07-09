package MYP_4B;
import java.io.*;
public class arraytrycatch {
	public static void main(String args []) throws IOException, NumberFormatException{
		String name[]=new String [5];
		int i;
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		try{
			for(i=0; i<5; i++){
				System.out.println("enter the name of 5 students:  ");
				name[i] = br.readLine();
			}
			System.out.println("Enter the number of student:  ")
			;
			i=Integer.parseInt(br.readLine());
			System.out.println("you have selected " +name[i]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("error!!!");
		}
	}
	
	

}
