package MYP_4B;
import java.io.*;
public class movie {
	String name;
	int people;
	long phno;
	long price;
	int movie;
	int type;
	long tprice;
	
	
	public void accept() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Your Name:  ");
		name=br.readLine();
		
		System.out.println("Your Phone Number:  ");
		phno=Long.parseLong(br.readLine());
		
		System.out.println("Movies:  \t 1) Jolly LLB 2 (U/A) \t 2) Sultan (U/A) \t 3) Zindagi na milegi Dobara (U/A)");
		movie=Integer.parseInt(br.readLine());
		
		System.out.println("Class:  \t 1) Silver(₹100) \t 2) Gold(₹150) \t 3)Platinum(₹200) ");
		type=Integer.parseInt(br.readLine());
			switch(type){
				case 1: price = 100;
						break;
				case 2: price = 150;
						break;
				case 3: price = 200;
						break;
			}
	
		System.out.println("No of People:  ");	
		people=Integer.parseInt(br.readLine());
	}
	public void compute(){
		tprice=price*people;
	}
	public void display(){
		
		System.out.println("-Total Bill-");
		
		System.out.println("Your Name:  "+name);
		System.out.println("Phone Number:  "+phno);
		System.out.println("No of People:  "+people);
			
		System.out.println("Movie:  ");
		if(movie==1){
			System.out.println("\tJolly LLB 2");
		}
		if(movie==2){
			System.out.println("\tsultan");
		}
		if(movie==3){
			System.out.println("\tZindagi na Milegi Dobara");
		}
			
		System.out.println("Class:  ");
		if(type==1){
			System.out.println("Silver");
		}
		if(type==2){
			System.out.println("Gold");
		}
		if(type==3){
			System.out.println("Platinum");
		}
		System.out.println("Total Bill:  "+tprice);
	}
	public static void main(String[] args)throws IOException{
		movie obj = new movie();
			obj.accept();
			obj.compute();
			obj.display();
	}
	}

