package package1;      //This java file is inside package named package1 inside src folder.
import java.util.*;       //importing all classes from java's util library.. Because it has Scanner class which is used to take input from user.

public class AliquoteSum       //Class declaration containing main function.
{

	public static void main(String[] args)    //main function declaration. and because it is static, program execution starts from main function.  
	{
		
	   //(1) FIRST PART OF THE PROBLEM.	
		
		int inputNumber;       //int variable to store the number input by user.
		int aliquotSum=0;      //int variable to count aliquot sum of inputNumber,initialized to zero.
		
		System.out.println("Enter the number for which you want to find the aliquot sum");
		// asking value of inputNumber from the user.
        // for printing this on screen. we have used the inbuilt function println() of out stream of System class.
		
		//Now we want to take input of the value of inputNumber from the user.
      	// For taking input from the user, we have to make the object of Scanner class.
      	//And we have to pass System.in stream in the constructor of that object to read input from keyboard.
		Scanner sc=new Scanner(System.in);       //creating object of Scanner class.
		
		inputNumber=sc.nextInt();           //Initializing inputNumber variable by the value input by user.
		
		for(int i = 1 ; i < inputNumber/2 + 1 ; i++)    //for loop to count aliquot sum.
		{
			if(inputNumber % i == 0)         //Conditional statement to check whether inputNumber is divisible by number or not.
			{
				aliquotSum+=i;        
			}
		}
		
		if(aliquotSum == inputNumber)
		       System.out.println("The value of aliquot Sum of input number is "+aliquotSum+" and it is the perfect number");
		else 
			System.out.println("The value of aliquot Sum of input number is "+aliquotSum+" and it is not the perfect number");
		
		
		//(2) SECOND PART OF THE PROBLEM.
		
		//We have to print the perfect numbers between 1 and 100. (Excluding 1 and 100)
		//We will take two loops, One will iterate through 1 to 100 and and another will check about perfect numbers.
		System.out.println("\nThe perfect numbers between 1 and 100 excluding both of them are :");
		for(int i = 2 ; i < 100 ; i++)        //Outer for loop to iterate through 1 to 100.
		{
			int countingAliquot=0;        //int variable to count the Aliquot sum of numbers.
			
			for(int j=1 ; j <= i/2 + 1 ; j++)      //Inner for loop to calcuate the Aliquot Sum of i'th number of outer loop.
			{
				if(i % j == 0)
					countingAliquot += j;         //Adding divisor to count Aliquot sum of number.
			}
			
			if(countingAliquot == i)        //Conditional loop to check weather the number is perfect or not.
				System.out.println(i);
		}
		
		sc.close();           //Closing the object of Scanner class.
	}   //End of main method.    
}    //End of class.
