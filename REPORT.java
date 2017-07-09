package MYP_4B;
import java.io.*;
public class REPORT {


        //data members
        int[] rollno = new int[5];
        String[] name = new String[5];
        int[] english = new int[5];
        int[] Math = new int[5];
        int[] InS = new int[5];
        int[] average = new int[5];


        int n;

        public void input() throws IOException {
                BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Enter the number of students:");
                n = Integer.parseInt(br.readLine());
                for(int i=1;i<=n;i++){
                        System.out.println("No." +i+" Student");
                        System.out.println("Enter the name of the student:");
                        name[i] = br.readLine();
                        System.out.println("Enter the students roll number:");
                        rollno[i] = Integer.parseInt(br.readLine());
                        System.out.println("Enter the marks for english(out of 100): ");
                        english[i] = Integer.parseInt(br.readLine());
                        System.out.println("Enter the marks for math(out of 100): ");
                        Math[i] = Integer.parseInt(br.readLine());
                        System.out.println("Enter the marks for InS(out of 100): ");
                        InS[i] = Integer.parseInt(br.readLine());
                        average[i] = (english[i] + Math[i] + InS[i])/3;

                        }
                }

        public void display() throws IOException {
                BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Name\t Roll no   English   Maths  InS   Average");
                for(int i=1;i<=n;i++){
                        System.out.println(""+name[i]+"\t"+rollno[i]+"\t"+english[i]+"\t"+Math[i]+"\t"+InS[i]+"\t"+average[i]);

                        }
                System.out.println("Enter 1)Average above 80  2)Average below 40");
                int g;
                g = Integer.parseInt(br.readLine());
                if(g==1){
                for(int i = 1; i<=n ; i++){
                        if(average[i] > 80) {
                                System.out.println("Name: "+name[i]+ "\nAverage: "+average[i]);
                        }
                }
                }
                else {
                        for(int i = 1; i<=n ; i++){
                                if(average[i] < 40) {
                                        System.out.println("Name: "+name[i]+ "\nAverage: "+average[i]);
                }
                }

                }

        }
public void compute() throws IOException {

}

        public static void main(String args[])throws IOException {
                REPORT obj = new REPORT();
                obj.input();
                obj.display();
        }

}

