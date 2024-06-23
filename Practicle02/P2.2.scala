var a: Int = 2
var b: Int = 3
var c: Int = 4
var d: Int = 5
var g: Int = 5
var k: Float = 4.3

@main def main(args:String*):Unit={
  expression1()
  expression2()
  expression3()
  expression4()
  expression5()
}

def expression1():Unit = {println({b-=1 ; b}*a+c*d); d-=1;}

def expression2():Unit = {println(a); a=a+1;}

def expression3():Unit = {printf("%.2f\n",-2.0 * (g - k) + c);}

def expression4():Unit = {println(c); c = c + 1;}

def expression5():Unit = {println({c=c+1;c} * a); a = a +1;}

