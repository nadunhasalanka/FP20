def bookPrice(x:Int):Double=x*24.95
def discount(x:Int):Double=bookPrice(x)*0.4
def shippingCost(x:Int):Double=if x <= 50 then x*3 else ((50*3)+((x-50)*0.75))
def totalCost(x:Int):Double = bookPrice(x)+shippingCost(x)-discount(x)