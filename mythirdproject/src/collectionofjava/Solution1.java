package collectionofjava;

import java.util.Scanner;

interface Sport {
	void calculateAvgAge(int[] age);

	void retirePlayer(int id);

}

class Cricket implements Sport {
	
	public void calculateAvgAge(int[] age) 
	{
		float total = 0;
		
		for(int i=0; i<age.length; i++) {
	         total = total + age[i];
	      }
		
		float avgAgedouble = total/age.length;
		String avgAge = String.format("%.02f", avgAgedouble);
		System.out.println("The average age of the team is " + avgAge);
	}
	
	public void retirePlayer(int id) 
	{
		if (playerIDs[id-1] == -1)
		{
			System.out.println("Player has already retired");

		}
		
		else {
			playerIDs[id-1] = -1;
			System.out.println("Player with id: " + id + " has retired");	
		}
		
	}
	
	int[] playerIDs;
	
	public Cricket()
	{
		playerIDs = new int[11];
		for (int i=0;i<11;i++)
		{
			playerIDs[i] = 1;
		}
		System.out.println("A new cricket team has been formed");
			
	}

	
}

class Football implements Sport {
	
	int[] playerIDs;
	
	public Football()
	{
		playerIDs = new int[11];
		for (int i=0;i<11;i++)
		{
			playerIDs[i] = 1;
		}
		System.out.println("A new football team has been formed");
			
	}
	
	public void calculateAvgAge(int[] age) 
	{
		float total = 0;
		
		for(int i=0; i<age.length; i++) {
	         total = total + age[i];
	      }
		
		float avgAgedouble = total/age.length;
		String avgAge = String.format("%.02f", avgAgedouble);
		System.out.println("The average age of the team is " + avgAge);
	}
	
	public void retirePlayer(int id) 
	{
		if (playerIDs[id-1] == -1)
		{
			System.out.println("Player has already retired");

		}
		
		else {
			playerIDs[id-1] = -1;
			System.out.println("Player with id: " + id + " has retired");	
		}
		
	}
	
	public void playerTransfer(int fee, int id) 
	{
		if (playerIDs[id-1] == 1)
		{
			System.out.println("Player with: " + id + " has been transferred with a fee of " + fee);

		}
		
		else if (playerIDs[id-1] == -1)
		{
			System.out.println("Player has already retired");

		}	
		
	}

	
}

public class Solution1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cricket c = new Cricket();
		Football f = new Football();

		int[] age1 = new int[11];
		int[] age2 = new int[11];

		for (int i = 0; i < 2; i++) {
			String[] age = sc.nextLine().split(" ");
			if (i == 0) {
				int j = 0;
				for (String s : age)
					age1[j++] = Integer.parseInt(s);
			} else {
				int j = 0;
				for (String s : age)
					age2[j++] = Integer.parseInt(s);
			}
		}
// these method we are defined in interface and implement  interface into cricket class and now we are just createing a object of cricket class 
		// and calling method of interface

		c.calculateAvgAge(age1);
		f.calculateAvgAge(age2);

		for (int i = 0; i < 6; i++) {

			if (i < 3) {
				int x = Integer.parseInt(sc.nextLine());

				c.retirePlayer(x);
			} else if (i < 5) {
				int x = Integer.parseInt(sc.nextLine());
				f.retirePlayer(x);
			} else {
				String[] temp = sc.nextLine().split(" ");
				f.playerTransfer(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
			}
		}
	}
}