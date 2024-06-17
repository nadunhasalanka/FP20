object runningTimeCalculator{

val pace1distance = 2
val pace2distance = 3
val pace3distance = 2

def easyPace(distance : Int):Int={
  distance * 8
}
def tempoPace(distance : Int):Int={
  distance * 7
}

def totalRunTime()={
  var totalRunTime = 0
  totalRunTime = easyPace(pace1distance) + tempoPace(pace2distance) + easyPace(pace3distance)
  println(s"total Running Time = $totalRunTime minutes")
}

def main(args: Array[String]):Unit={
  totalRunTime()
}

}