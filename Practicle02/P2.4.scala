def attendance(price: Int): Double = return 120 + ((15 - price) / 5) * 20.0

def totalCost(price: Int): Double = return attendance(price)*3 +500

def profit(price: Int): Double = return attendance(price)*price - totalCost(price)