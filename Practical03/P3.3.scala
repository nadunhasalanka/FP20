def mean(num1 : Int, num2 : Int):Float =
  val mean = num1.toFloat / num2
  // printf("%.2f \n",mean)
  return mean

@main def main(): Unit =
  printf("%.2f \n",mean(1,2))