package MYP_4B;

import java.io.*;

public class STD_program {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String city[] = new String[10];
		int STD[] = new int[10];
		int i;

		for (i = 0; i < 10; i++) 
		{
			System.out.println("Enter the name and STD code: ");
			city[i] = br.readLine();
			STD[i] = Integer.parseInt(br.readLine());

		}
		System.out.print("Enter the city name to be searched: ");
		String scity = br.readLine();

		boolean flag = false;
		for (i = 0; i < 10; i++)
		{
			if (city[i].equals(scity))
			{
				System.out.println("Search successful");
				System.out.println(city[i] + " : " + STD[i]);
				flag = true;
				break;
			} 
		}
			if (flag == false) 
			{
				System.out.println("Search Unsuccessful. No such city in the list ");
			}

		}
	}

