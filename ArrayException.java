package MYP_4B;


public class ArrayException {

	public static void main(String args[]){
		try { 
			int a[] = new int[2];
			System.out.println("Access element three :" + a[3] );
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("exception thrown :" +e);
			
		}
		System.out.println("out of bounds");
		
	}
}
