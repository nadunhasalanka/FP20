object calculateVolume{

def volume(radious : Double)={
  var volume = 0.0
  volume = (4.0/3.0)*3.14*radious*radious
  println(s"volume of a sphere with radious $radious is $volume")

}

def main(args : Array[String]):Unit={
  volume(5)
}

}