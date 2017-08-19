package package1;   //This java file is inside package named package1 inside src folder.
import java.util.*;       //importing all classes from java's util library.. Because it has Collection Class needed for this Assignment.

/*
 *  This Problem helped me to master the concepts of String Handling.
 */

public class TagTextExtractor    //class declaration containing main function. 
{

	public static void main(String[] args) //main function declaration. and because it is static, program execution starts from main function.
	{
		//Asking for input from user.
		System.out.println("Enter the String which contains tags : ");
		System.out.println();
		
		//creating object of Scannner class.
		Scanner sc=new Scanner(System.in);
		
		//Taking input for whole line.
		String inputString = sc.nextLine();
		int flagVariable = 0;     //flag variable as alternative for stack to detect '<' and '>' characters.
		String extractedString="";    //String to store the extracted characters.
		
		//for loop to traverse through the whole String.
		for(int i = 0 ; i < inputString.length() ; i++)
		{
			//if character at position is '<' then make flag as 1.
			if(inputString.charAt(i)=='<')
			{
				flagVariable=1;
				i++;
			}
			
			//if character at position is '>' then make flag as 0.
			if(inputString.charAt(i)=='>')
			{
				flagVariable=0;
				i++;
			}
			
			//if flag is 0 and current position character is '<', then make flag 1.
			if(flagVariable==0 && i<inputString.length() && inputString.charAt(i)=='<')
			{
				flagVariable=1;
				i++;
			}
			
			//if flag is 0 and current position character is not '<', then put the character in output String.
			if(flagVariable==0 && i<inputString.length() && inputString.charAt(i)!='<')
				extractedString+=inputString.charAt(i);
			
		}
		
		//Printing the output.
		System.out.println("\n\n Extracted String is : \n");
		System.out.println(extractedString);
		
		//closing the Scanner class.
		sc.close();
		
	}    //End of main function.

}//End of class.
