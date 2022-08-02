package Array;

import java.util.Scanner;

public class DiceStats {
	

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in); 
		System.out.println("enter amount of dice you want to create:");
		int input = myObj.nextInt();
		System.out.println("You have entered: "+input);
		
		Dice[]newDice = new Dice[input];
		int[] diceStat = new int[(6*newDice.length)+1];
		
		for(int i = 0; i<100; i++) {
			
			for(int k = 0; k<=newDice.length-1; k++)
				newDice[k] = new Dice();
			
			int sum = 0;
			for(int k = 0; k<=newDice.length-1; k++) 
				sum = sum + newDice[k].a;
				
			
		diceStat[sum] = diceStat[sum]+1;
		
		}
		for(int i = input; i<diceStat.length; i++)
		System.out.println("Dice eyes: "+i+" has gotten: "+diceStat[i]+" summarized dice eyes, with roll 100 times");
		
		
	}

}
