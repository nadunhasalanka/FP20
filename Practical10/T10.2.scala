class RN(n: Int, d: Int) {
  require(d != 0, "Denominator must be nonzero")
  
  val number = n
  val denominator = d
  val rn: Int = n / d
  
  def this(n: Int) = this(n, 1)
  
  def +(that: RN): RN =
    new RN((this.number * that.denominator) + (this.denominator * that.number) , this.denominator * that.denominator)
  
  def -(that: RN): RN =
    new RN((this.number * that.denominator) - (this.denominator * that.number) , this.denominator * that.denominator)

  
  def *(that: RN): RN =
    new RN(this.number * that.number, this.denominator * that.denominator)
  
  def /(that: RN): RN =
    new RN(this.number * that.denominator, this.denominator * that.number)


      // Override the toString method to provide a custom string representation
  override def toString: String = s"$number/$denominator"
  
  def neg: RN = new RN(-number, denominator)

  
}

object RNTest {
  def main(args: Array[String]): Unit = {
    val x = new RN(3, 4)
    val y = new RN(5, 8)
    val z = new RN(2, 7)

    val a = x * (y - z)
    println(s"\nx*(y-z) is: $a\n")
  }
}