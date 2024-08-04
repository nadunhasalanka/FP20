def filterPrime(numbers: List[Int]): List[Int] = {
  numbers.filter(num => isPrime(num))
}

def isPrime(num: Int): Boolean = {
  if (num <= 1) false
  else {
    for (i <- 2 to num / 2) {
      if (num % i == 0) return false
    }
    true
  }
}

@main def main(): Unit = {
  val Input = List(1,2,3,4,5,6,7,8,9,10)
  val Output = filterPrime(Input)
  print(Output)
}