// object StringFilter:
//   def filterLongStrings(strings: List[String]): List[String] =
//     strings.filter(_.length > 5)

object FilterStrings:
  def filterLongStrings(strings: List[String]): List[String] =
    var result = List[String]()
    var index = 0

    while (index < strings.length)
      val string = strings(index)
      if (string.length > 5){
        result = result :+ string
      }

      index += 1
    return result

@main def main(): Unit =
  println("Please enter strings separated by spaces:")
  val input = scala.io.StdIn.readLine()
  val inputStrings = input.split("\\s+").toList
  val result = FilterStrings.filterLongStrings(inputStrings)
  println(s"Filtered result: $result")
