P8.1.scala
# import scala.io.StdIn.readLine and import scala.io.StdIn.readInt: These import statements allow you to use the readLine and readInt functions 
 from the StdIn object to take input from the user. readLine is used for reading strings, and readInt is used for reading integers.
# def encryption(plainText: String, shift: Int): String: Defines a function named encryption that takes a String (plainText) and an Int (shift) as parameters and returns an encrypted String
# plainText.toList.map(_.toInt): Converts the plainText string into a list of characters and then maps each character to its corresponding ASCII integer value using _.toInt.
  shiftedValues: This list will store the ASCII values of the shifted characters.
# if (value >= 65 && value <= 90): Checks if the character is an uppercase letter (ASCII values 65 to 90).
((value - 65 + shift) % 26) + 65: Shifts the character within the range of uppercase letters. The formula ensures that the shifted value wraps around within the alphabet using the modulo operation.
# else if (value >= 97 && value <= 122): Checks if the character is a lowercase letter (ASCII values 97 to 122).
((value - 97 + shift) % 26) + 97: Shifts the character within the range of lowercase letters, again using modulo to ensure wrapping within the alphabet.
#   val result = operation match {
    case 1 => encryption(userInput, shift)
    case 2 => decryption(userInput, shift)
    case _ => "Invalid operation. Please choose '1.encrypt' or '2.decrypt'."
  }
# operation match { ... }: Uses pattern matching to determine if the user selected encryption (case 1) or decryption (case 2). Depending on the choice, it calls the appropriate function with userInput and shift.
case _: If the user enters something other than 1 or 2, an error message is returned.
# WHY % FUNCTION IS USED ?
	* The modulo function is crucial in the Caesar cipher algorithm because it ensures that the shifted values wrap around within the range of letters in the alphabet.
	* Without Modulo ????
Without the modulo operation, shifting Z by 1 would give you a value that is outside the range of the alphabet:

The ASCII value of Z is 90.
Shifting Z by 1 would give you 91.
91 corresponds to '[', which is not a letter.
	* With Modulo ????
=> ((value - 65 + shift) % 26) + 65

value - 65: Converts the ASCII value of the letter into a 0-based index (e.g., A=0, B=1, ..., Z=25).
+ shift: Applies the shift.
% 26: The modulo operation ensures that the result stays within the range 0-25. If the value exceeds 25 (e.g., shifting Z results in 26), 
the modulo operation wraps it back to 0 (which corresponds to A).
+ 65: Converts the 0-based index back into the correct ASCII value.
