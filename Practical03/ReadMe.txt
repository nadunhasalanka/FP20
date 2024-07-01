P3.1
* I used readLine to get user input and use recursive method to reverse the string.

P3.2
* def filterLongStrings(strings: List[String]): List[String] =
* with above method we getting a input as a List and rturn a List at the end
* for the while function used the index of the List and with 'while (index < strings.length)' 
  Starts a while loop that iterates through the list of input strings.
* inside the loop 'val string = strings(index)' Retrieves the string at the current index.
* 'if (string.length > 5) { result = result :+ string }' Checks if the length of string is greater than 5. 
   If true, appends string to result and continue.
* '@main def main(): Unit =' Defines the main entry point of the program.
* 'val input = scala.io.StdIn.readLine()' Reads user input from the console.
* 'val inputStrings = input.split("\\s+").toList' Splits the input string into a list of strings using whitespace as the delimiter.
	
	\\: This is an escape sequence in Scala strings to represent a literal backslash \.
	s+: This is a regular expression pattern which means:
	 s: Matches any whitespace character (like spaces, tabs, newlines).
	 +: Matches one or more occurrences of the preceding pattern (s in this case).
	So, "\\s+" as a whole matches one or more whitespace characters. When input.split("\\s+") is called:

	It splits the input string wherever one or more whitespace characters occur.
	This effectively breaks the input string into individual substrings wherever
	there are spaces, tabs, or newlines, and returns them as a list of strings (List[String]).

P3.3
* 'printf("%.2f \n", mean(1, 2))' Calls the mean function with arguments 1 and 2, 
   computes the mean (1.0 / 2), and prints the result formatted to two decimal places using printf.

P3.4
* in this code segmentation getNumbers() function is the function that gets user inputs and store them
* in inputList same thing happens like the 2nd code with spilt function
	*The input variable is assumed to be a string that contains numbers separated by spaces.
	*The split("\\s+") method splits this string into an array of substrings wherever 
	 it finds one or more whitespace characters (\\s+ is a regular expression for one or more whitespace characters).
	*For example, if input is "1 2 3 4 5", split("\\s+") will produce an array Array("1", "2", "3", "4", "5").
* .toList will converts the array into a List. Lists are more idiomatic in scala and provide functional methods that arrays do 
  not provide.
	*Continuing the example, Array("1", "2", "3", "4", "5").toList produces List("1", "2", "3", "4", "5").
* .map(_.toInt) 
	*The map method applies a given function to each element of the list and returns a new list with the results.
	*Here, the function _.toInt is shorthand for x => x.toInt, which converts each string element to an integer.
	*So, List("1", "2", "3", "4", "5").map(_.toInt) produces List(1, 2, 3, 4, 5).
** after all most simple way 

	val input = "1 2 3 4 5"                 // Example input string
	val inputList = input                   // Start with the input string
  	.split("\\s+")                        // Split into an array of strings: Array("1", "2", "3", "4", "5")
  	.toList                               // Convert to a List of strings: List("1", "2", "3", "4", "5")
  	.map(_.toInt)                         // Convert each string to an integer: List(1, 2, 3, 4, 5)



* Indent of the code is important in scala as well as return 
* for returning something return key word is not needed  