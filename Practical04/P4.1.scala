var itemName: Array[String] = Array()
var itemQuantity: Array[Int] = Array()

def restockItem(item: String, quantity: Int): Unit=
  var itemIndex = findItem(item, quantity)
  if (itemIndex == -1)
    print("item does not exist\n")
  else  
    itemQuantity(itemIndex) += quantity

def findItem(item: String, quantity: Int): Int=
  for (i <- 0 until itemName.length){
    if(itemName(i) == item){
      return i
    }
  }
  return -1


def displayInventory()=
  for(i <- 0 until itemName.length){
    printf("%s %d\n",itemName(i),itemQuantity(i))
  }

def selItem(item: String, quantity: Int)=
  var itemIndex = findItem(item, quantity)
  if (itemIndex == -1)
    print("item does not exist\n")
  else if (itemQuantity(itemIndex) < quantity)
    printf("%s does not having quantity to sell\n",item)     
  else  
    itemQuantity(itemIndex) -= quantity
  


@main def main():Unit = 
  itemName = Array("apple", "banana", "orange")
  itemQuantity = Array(10,20,0)
  displayInventory()
  restockItem("apple",10)
  displayInventory()
  selItem("banaa", 10)
  displayInventory()