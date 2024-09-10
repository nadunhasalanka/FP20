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

  def interest(): Unit =
    if (balance > 0) {
      balance += balance * 0.05
    }
    else {
      balance += balance * 1
    }
    

  def print():Unit = 
    println(s"Account: $name , Balance: $balance")
}

def Sum(accounts: List[Account]): Double =
  accounts.map(_.balance).sum


object AccountTest {
  def main(args: Array[String]): Unit ={
    val accounts: List[Account] = List(
      new Account(-10, "Nadun"),
      new Account(500, "Tanuri"),
      new Account(200, "Tharindu"),
      new Account(100, "Nirmi")
    )

    accounts.foreach(_.print())
    println("Sum of all account balances: " + Sum(accounts))
    accounts.foreach(_.interest())
    println("\nAfter applying interest:")
    accounts.foreach(_.print())
  
}}

