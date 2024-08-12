import scala.io.StdIn.readInt

@main def main(): Unit =
  print("Provide an Integer as Input : ")
  val input = readInt()

  val result = input match {
      case n if ((n: Int) => n % 3 == 0 && n % 5 == 0)(n) => "Multiple of Both Three and Five"

      case n if ((n: Int) => n % 3 == 0)(n) => "Multiple of Three"

      case n if ((n: Int) => n % 5 == 0)(n) => "Multiple of Five"
        // (n): This part immediately applies the lambda function to the variable n.
        // The lambda function is first defined, and then it is called with n as the argument.

      case _ => "Not a Multiple of Three or Five"
  }
  println(result)

