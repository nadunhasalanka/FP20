import scala.io.StdIn.readLine

var result = List[Int]()

def getNumber(): List[Int] =
  while(true)
    val input = readLine("Enter a number(to exit enter q): ")
    if (input.toLowerCase() != "q")
      val number = input.toInt
      if (number % 2 != 0)
        result = result :+ number
    else {
        println("exiting")
        return result
    }
  return result


def calculateNumbers(numbers: List[Int]):Int=
  var sum = 0
  var index = 0
  while (index < numbers.length){
    sum += numbers(index)
    index += 1
  }
  return sum

def main(args: Array[String]): Unit =
    val result = getNumber()
    val result1 = calculateNumbers(result)
    printf("%d",result1)