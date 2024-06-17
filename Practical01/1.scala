object Areacalculator {
var result : Double = 0

def area(radious: Double): Double = {
  result = 3.14 * radious * radious
  println(s"area of the disk is $result")
  result
}

def main(arags: Array[String]):Unit={
  area(5)
}
}