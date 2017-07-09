package MYP_4B;
import java.util.ArrayList;
public class Array_List_example2 {
	public static void main(String args[]){
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("shlok");
		list.add("parth");
		list.add("attharva");
		list.add("iliyan");
		list.add("prarthana");
		
		System.out.println("Elements in the Array List " +list);
		list.add(0, "Karan");
		list.add(1,"Vishnu");
		
		list.remove("attharva");
		list.remove("Iliyan");
		
		System.out.println("new current list is: "+list);
		
		list.remove(1);
		
		System.out.println("new current list is: "+list);
		
		
		
		
	}

}
