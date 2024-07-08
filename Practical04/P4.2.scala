def categorize(n: Int): String=
  n match {
    case n if n <= 0 => "Negative/Zero Inter"
    case n if n%2==0 => "Input is Even"
    case _ => "Input is odd"
  }

@main def main(args: String*): Unit=
    if (args.isEmpty) 
      println("Please enter a number")
    else
      val input = args(0)
      if (input.forall(_.isDigit))
        val num = input.toInt
        println(s"${input} -> ${categorize(num)}")
      else
        println("please enter a valid integr.")
    