package MYP_4B;

public class StringFunction {
	String aa="shlok";
	String bb="shlok";
	
	public static void main(String[]args){
		StringFunction obj=new StringFunction();
		System.out.println("length : "+obj.aa.length());
		System.out.println("character At : "+obj.aa.charAt(1));
		System.out.println("concat : "+obj.aa.concat(obj.bb));
		System.out.println("compare : "+obj.aa.compareTo(obj.bb));
		
		if(obj.aa.compareTo(obj.bb)==0){
			System.out.println("same ");
		}
		else
			System.out.println("not same ");
		
	}

}
