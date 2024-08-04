P7.1.scala
def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(num => num % 2 == 0)
}
# this function is getting numbers as a list and also returning a List of ints
# and then "numbers.filter(num => num % 2 == 0)" it uses filter function to filter number that even(what is actually happening ?)
# "numbers.filter()" function will return a new list including elements that satisfy the condition inside () and there is a lambda function
# so the new list that created by .filter() has all elements from lambda that returns true

# what is a lambda function ?
  - anonymous function (does not having a name)
  - use for shorting
# (parameter) => expression
# "(num => num % 2 == 0)" in here num is the parameter that passes to lambda function 
# 1 % 2 == 0 is false (1 is odd), so 1 is excluded
# 2 % 2 == 0 is true (2 is even), so 2 is included

P7.2.scala
# def calculateSquare(numbers: List[Int]): List[Int] = {
  numbers.map(num => num * num)
}
# same as the first one nothing fancy

P7.3.scala
  if (num <= 1) false
  else {
    for (i <- 2 to num / 2) {
      if (num % i == 0) return false
    }
    true
  }

# here there is alog behind the primenumber filter
# first if the number is less than 1 it returns false 
# then for loop will run and i will start from 2 and run until num/2
# loop checks possible divisors from 2 to num/2 why ?
# large divisor would result in a product greater than num so its unnecesssary to check beyond this point 
# 