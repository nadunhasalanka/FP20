import scala.io.StdIn.readLine

object ReverseString:

  def reverseString(text: String): String =
    if text.isEmpty then "" else reverseString(text.tail) + text.head

  def main(args: Array[String]): Unit =
    val input = readLine("Enter the string: ")
    val reversedString = reverseString(input)

    print(s"Reversed String: $reversedString")