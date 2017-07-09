package MYP_4B;
import java.io.*;

public class Bank {
	  //data members
    String name;
    long accno;
    int b;
    double num=100000;
    
    double withdraw;
    double deposit;
    
    public void accept() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Please enter your name");
        name = br.readLine();
        System.out.println("Please enter your account number");
        accno = Long.parseLong(br.readLine());
      
        
        System.out.println("  1 : withdrawing   2: depositing");
        b = Integer.parseInt(br.readLine());
        if (b==1){
            System.out.println("How much money do you want to withdraw?");
            withdraw = Double.parseDouble(br.readLine());
            
            if(withdraw > num ) {
            System.out.println("You do not have that much money in your account");    
            }
            else {
                num = num - withdraw;
                System.out.println("You have succesfully withdrawn "+withdraw+ " rupees");
                System.out.println("Your account details is as follows: ")
                ;
                System.out.println("name: "+name );
                
                System.out.println("Account number: : "+accno );
                
                System.out.println("\nYour current balance now is " +num);
                
            }
            
        }
        else if(b==2){
            System.out.println("Please enter the amount of money you want to deposit:");
            deposit = Double.parseDouble(br.readLine());
            num = num + deposit;
            System.out.println("You have successfully deposit "+deposit+" rupees" );
            System.out.println("name: "+name );
            
            System.out.println("Account number: : "+accno );
            System.out.println("Your current balance is "+num);
        }
        else {
            System.out.println("The number you have entered is wrong");
        }
        
        
    }
    public static void main(String args[]) throws IOException{
        Bank obj = new Bank();
        obj.accept();
    }
    




}

