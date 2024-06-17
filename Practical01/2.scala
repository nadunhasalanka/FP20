object CelciousToFahrenheit{

def convertCtoF(C : Double): Double ={
  var F:Double=0.00
  F = C + 1.8 + 32
  println(s"after converting $C C = $F F")
  F
}

def main(args : Array[String]):Unit={
  convertCtoF(35)
}

}