object wholleSaleCalculator{

def calDiscount(copies : Int):Double={
  var discount = (24.95 * copies)*(.4)
  discount
}

def ShippingCost(copies : Int):Double={
  var ShippingCost = 0.0

  if (copies <= 50){
    ShippingCost = 3*50
  }else {
    ShippingCost = 3*50 + (copies - 50)*0.75
  }
  ShippingCost
}

def totalCost(copies : Int)={
  var totalCost = 0.0
  totalCost = (24.95 * copies) - calDiscount(copies) + ShippingCost(copies)
  println(s"total cost to $copies Books is $totalCost")
}

def main(args: Array[String]): Unit={
  val copies = 60
  totalCost(copies)
}

}