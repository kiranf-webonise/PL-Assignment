//Programming Language - Java Programming

/*Why-
	1)Type of Application to be Build-
		Check that what are the requirements of your application,In this case I need to work on the text data and there is a separate class available in the 			java called String.
	
	2)High developer support-
		There are various forums available on the internet where thousands of developers are active and we can get the best support by them.

	3)Ease of handling-
		As java has number of inbuilt methods on strings that can help me out to perform various operations on the text data.

	4)Platform Independent-
		Once you write code can run on any platform as it uses Java Virtual Machine(JVM) that generates bytecode and bytecode can directly run on the 			machine.

	5)Futer Scope-
		If you want further to be used with files as input,that can extend the the level of application.
*/

// Program for the Statistics of the Text data


//import java.io.*;

public class Textstat
{
	public static void main(String args[])
	{
		int spacecntr=0,upper=0,lower=0;
		String expr="This is simple Program";
		System.out.println("\n"+expr);
	
		for(int i=0;i<expr.length();i++)
		{
			if(expr.charAt(i)==' ')
			{
				++spacecntr;
			}
			if(Character.isUpperCase(expr.charAt(i)))
			{
				++upper;
			}
			if(Character.isLowerCase(expr.charAt(i)))
			{
				++lower;
			}
		
		}
		System.out.println("\nNo of Spaces:"+spacecntr);
		System.out.println("No of Words: "+(spacecntr+1));
		System.out.println("No of UpperCase Chars:"+upper);
		System.out.println("No of LowerCase Chars:"+lower);
	}
}


/*Actual Implementation


--import java.io.*;
	This is the default package available in the java that includes the input and output streams.

--public class Textstat
	This is the class Textstat which is preceded by the public keyword it suggests that the members can be accessed by the other classes.

--public static void main(String args[])
	-This is the main method from where the actual execution of the program get starts.
	-It is public because the method should get accessed by jvm
	-static methods do not need any object to call them and main method is the first one to execute therefore jvm finds it easily.
	-we do not need to return anything to jvm thats why the main return type is void.
	-and main is the keyword that jvm searches for the first in execution.
	-we can pass arguments to the main method in string format.

--int spacecntr=0;
	-initialized variable to 0.

--stored text data in to the string expr. 

					
	index		=		0    1    2    3   4   5   6   7   8   9    10  11  12  13  14   15 16 17 18  19  20 21

 	expr		=		T    h    i    s       i   s       s   i    m    p   l  e        P  r  o  g   r   a  m

				
	Iteration	=		0    1    2    3   4   5   6   7   8   9   10   11  12 13  14   15 16 17 18  19  20  21
 	
	Spacecntr	=               0    0    0    0   1   1   1   2   2   2   2    2   2  2   3    3  3  3  3   3   3   3 =======> 3
	
	upper		=               1    1    1    1   1   1   1   1   1   1   1    1   1  1   1    2  2  2  2   2   2   2 =======> 2
	
	lower		=	        0    1    2    3   3   4   5   5   6   7   8    9  10  11  11  11 12 13  14 15  16  17 =======> 17

--System.out.println("\n"+expr);
	while printing the text on console it will ignore the following codes and perform operation
		
		1) \"	-Double quotes
		2) \\	-BackSlash
		3) \t	-Tab
		4) \n	-New Line



--for(int i=0;i<expr.length();i++)

	-initialize int i=0														i=0
		This will execute only once at the start of the for loop. 

	-i<expr.length()														true
		At each time it will check the condition i must lower than the max length of available string.

	-if(expr.charAt(i)==' ')													false
			

		charAt(pos.) is a method that returns the available character at the particular position in the string if char is space 
		then it will true.												

		If true then increment the spacecounter by 1. 

	-if(Character.isUpperCase(expr.charAt(i)))
		It will check for the character at index i if it is upper case letter the condition become true and increment counter upper.

	-if(Character.isLowerCase(expr.charAt(i)))
		isLowerCase will return true in case of the character at i position is lowercase. 

--for loop will execute till the last character available in the string.



--System.out.println("\nNo of Spaces:"+spacecntr);
--System.out.println("No of Words: "+(spacecntr+1));
--System.out.println("No of UpperCase Chars:"+upper);
--System.out.println("No of LowerCase Chars:"+lower);

		It will simply print the counter value





*/
