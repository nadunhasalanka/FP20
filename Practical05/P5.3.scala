@main def main():Unit= {
  printFirstNFibonacci(10)
}

def printFirstNFibonacci(n: Int): Unit = {
  if (n > 0) fibo(0, 1, n)
}

def fibo(a: Int, b: Int, count: Int): Unit = {
    if (count > 0) {
      println(a)
      fibo(b, a + b, count - 1)
    }
}