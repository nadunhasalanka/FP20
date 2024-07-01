import scala.io.StdIn.readLine
// import scala.compiletime.ops.int

def getNumbers(): List[Int] =
  println("Enter list of numbers seperated:")
  val input = scala.io.StdIn.readLine()
  val inputList = input.split("\\s+").toList.map(_.toInt)
  return inputList

def calculateSum(numbers: List[Int]): Int =
  var sum = 0
  var index = 0
  while (index < numbers.length)
    if (numbers(index) % 2 == 0) then sum += numbers(index)
    
    index += 1

  return sum  

@main def main()=
  val result = getNumbers()
  val result1 = calculateSum(result)
  printf("%d",result1)
