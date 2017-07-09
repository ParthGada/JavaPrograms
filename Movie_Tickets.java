package MYP_4B;
import java.io.*;
public class Movie_Tickets {

    
        
        String Movie;
        int Year;
        int Ratings;
        
        
        public void accept()throws IOException
       
        {
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter NAME OF THE MOVIE:");
            Movie=br.readLine();
            System.out.println("Enter YEAR OF THE MOVIE:");
            Year= (int) Double.parseDouble(br.readLine());
            System.out.println("Enter THE RATINGS OF THE MOVIE:");
            Ratings =(int) Double.parseDouble(br.readLine());
        }
       
        public void display()
        {
            System.out.println("Name of the Movie:- " + Movie);
            System.out.println("_____________________");
            System.out.println("Year of the Movie:- " + Year);
            System.out.println("_____________________");
            System.out.println("Ratings of the Movie:- " + Ratings);
            System.out.println("_____________________");
           
        }
       
        public void compute()
        {
             if (Ratings ==0){
                 System.out.println("This movie is the worst movie");
             }
             else if (Ratings==5 ){
                 System.out.println("This movie is a very good movie");
             }
             else if (Ratings ==4 ){
                 System.out.println("This movie is a very good movie");
             }
             else if (Ratings ==3 ){
                 System.out.println("This movie is an good movie");
             }
             else if (Ratings ==2 ){
                 System.out.println("This movie is an Ok-Ok movie");
             }
             else if (Ratings ==1 ){
                 System.out.println("This movie is the worst movie");
             }
    
        }
       
        
        public static void main(String args[])throws IOException
        {
            Movie_Tickets  ob=new Movie_Tickets ();
            ob.accept();
            ob.compute();
            ob.display();
        }
       
    }



