package MYP_4B;

public class Switchcase {
public static void main(String args[]){
	int a = 10 , b = 20, c =30;
	int status = 0;
	
	if(a>b&&a>c)
		status = 1;
	else if(b>c)
		status=2;
	else
		status=3;
	switch(status)
	{
	case 1: System.out.println("a is the greatest");
	break;
	case 2 : System.out.println("b is the greatest");
	break;
	case 3: System.out.println("c is the greatest");
	break;
	
	}
}
}
