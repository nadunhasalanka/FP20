@main def main(args:String*):Unit={
  takeHomeSalary()
}

def takeHomeSalary(): Double = {
  var total_salary = totalSalary(40,30)
  var tax = taxFunction(total_salary)
  println(total_salary - tax)
  return total_salary - tax
}

def totalSalary(normalHours: Int, otHours: Int): Double= return normalHours * 250.00 + otHours * 85.00 

def taxFunction(totalSalary: Double): Double = return totalSalary*0.12