package MYP_4B;
import java.io.*;
import java.util.ArrayList;
public class ArrayListExample {
static ArrayList<String> mlist= new ArrayList<String>();

public static void main(String args[])throws IOException{
	mlist.add("Sunday");
	mlist.add("Monday");
	mlist.add("tuesday");
	mlist.add("wednesday");
	mlist.add("thursday");
	mlist.add("friday");
	mlist.add("saturday");
	System.out.println("Enter position of the day:  ");
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int position = Integer.parseInt(br.readLine());
	
	if(position <0 || position >7){
		System.out.println("Please enter a vaild day position : 0-7");
	}
	else {
		System.out.println("day at position : "+position + "is:"  + mlist.get(position-1));
	
	}
}
}
