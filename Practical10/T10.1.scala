class RN(n: Int, d: Int) {
  require(d != 0, "Denominator must be nonzero")
  
  val number = n
  val denominator = d
  val rn: Int = n / d
  
  def this(n: Int) = this(n, 1)
  
  def +(that: RN): RN =
    new RN((this.number * that.denominator) + (this.denominator * that.number) , this.denominator * that.denominator)
  
  def -(that: RN): RN =
    this + that.neg
  
  def *(that: RN): RN =
    new RN(this.number * that.number, this.denominator * that.denominator)
  
  def /(that: RN): RN =
    new RN(this.number * that.denominator, this.denominator * that.number)


      // Override the toString method to provide a custom string representation
  override def toString: String = s"$number/$denominator"
  
  def neg: RN = new RN(-number, denominator)

  
}

// Example usage
object RNTest {
  def main(args: Array[String]): Unit = {
    val x = new RN(1, 3)
    println(s"x = $x")
    println(s"x.neg = ${x.neg}")
    
    val y = new RN(2, 3)
    println(s"y = $y")
    println(s"y.neg = ${y.neg}")
  }
}
