@main def main(args:String*):Unit={
  print("total rinning time:")
  println(easy(2)+easy(2)+tempo(3))
}

def easy(distance:Int):Int=distance*8
def tempo(distance:Int):Int=distance*7