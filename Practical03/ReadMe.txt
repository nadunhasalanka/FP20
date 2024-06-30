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
* 'import scala.io.StdIn.readLine' Imports the readLine function from scala.io.StdIn, which allows reading input from the console.
* 'getNumber()' this function will run until q was enterd by the user and if a even number enterd,
   that will goes to to a List called result(declared globaly).
* 'if (input.toLowerCase() != "q")' this line converts input to lower case in case of 'Q' is entered.
* 'val number = input.toInt' input is stored into a const variable called number and toInt function
   convert string into a Integer value
*  after checking if number is a even number that will add into result List
*  then using indexes on the List sum of the even numbers is calculate and store into sum
*  main function is display the sum


* Indent of the code is important in scala as well as return 
* for returning something return key word is not needed  