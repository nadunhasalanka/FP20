class Account(n: Double, accountname: String) {
  val name: String = accountname
  var balance: Double = n

  def deposit(amount: Double): Unit = 
    balance += amount

  def withdraw(amount: Double): Unit =
    balance -= amount

  def transfer(amount: Double, account: Account): Unit =
    this.balance -= amount 
    account.balance += amount


  def print():Unit = 
    println(s"Account: $name , Balance: $balance")
}

object AccountTest {
  def main (args: Array[String]): Unit = 
    val a = new Account(1000, "John")
    val b = new Account(500, "Jane")
    a.print()
    b.print()
    a.transfer(200, b)
    a.print()
    b.print()
}