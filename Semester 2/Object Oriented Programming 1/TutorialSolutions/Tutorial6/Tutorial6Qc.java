//Tutorial6Qc.java
/*A program that reads an arbitrary number of positive integers, terminated by -1 and
 *displays the values entered back to the user. It ensures that only positive integers
 *are accepted into the program. This program also determines any palindromic numbers
 *and lists them*/

import java.util.Scanner;

public class Tutorial6Qc {
	public static void main(String args[]) 	
	{
		String allNumbers = "",numberAsString,allPalindromes="";
		int number,i=0;
		boolean valid = false;
		
		Scanner input = new Scanner(System.in);
		
		do{
		
			System.out.print("Please enter a positive integer number (-1 to exit): ");
			numberAsString = input.nextLine();
			
			valid = false;

	        while(!valid)
	        {   
	        	//Keep looking at each subsequent character in the string until either the end of the string
	        	//is reached or we encounter a non-digit. Keep count of all digits encountered.
	        	while(i<numberAsString.length() && numberAsString.charAt(i)>= '0' && numberAsString.charAt(i) <= '9')
	        		i++;
	        	
	        	//If it turns out the value of i is equal to the length of the string then we know for certain that
	        	//the string only contains digits and so we set valid to true to enable the main validation loop to stop
	        	//However we must ensure that there was at least one character in the string also or otherwise the empty
	        	//string will be taken as being valid input. Finally we must allow the value -1 to be accepted, even 
	        	//though it is not a positive integer value, as it is our sentinel value here
	        		
	        	if(i==numberAsString.length() && i>0 || numberAsString.equals("-1"))
	        	{
	        		valid = true;
	        	}
	        	else
	        	{
	        		System.out.print("Error: You must enter a positive integer number (-1 to exit). Please re-enter: ");
	        		numberAsString = input.nextLine();
	        	}
	        	
	        	i = 0;	//must reset i to zero for the next iteration of the validation loop
	        }
		
			//now that the string has been validated, try to convert it to an integer value
			number = Integer.parseInt(numberAsString);
		
			if(number!=-1)	
				allNumbers += number + " ";
				
			//As long as we have not reached the middle of the string and the corresponding characters going forward and
			//backwards match, then keep track of the number of matches
			while(i<numberAsString.length()/2 && numberAsString.charAt(i)==numberAsString.charAt(numberAsString.length()-i-1))
				i++;
		
			//if the number of matches is equal to the length of the string divided by 2 then we have a palindrome
			if (i == numberAsString.length()/2)
				{
					allPalindromes += numberAsString + " ";
				}
		
			i = 0;
				
			System.out.println();
		
		}while(number!=-1);
				
		System.out.println("\n\nThe numbers you entered were: " + allNumbers + "\nThe palindromes among these " + 
			"numbers are: " + allPalindromes);
			
	}
}