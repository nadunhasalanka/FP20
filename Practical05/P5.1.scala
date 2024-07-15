import scala.io.StdIn.readLine

def main(args: Array[String]): Unit = {
  val productList = getProductList()
  println("\nProduct List:")
  printProductList(productList)
  val totalProducts = getTotalProducts(productList)
  println(s"\nTotal number of products: $totalProducts")
}

// Function to get the list of product names from the user
def getProductList(): List[String] = {
  var products = List[String]()
  var input = ""
  while (input != "done") {
    input = readLine("Enter product name (type 'done' to end): ")
    if (input != "done") products = products :+ input
  }
  products
}

// Function to print the product list with positions
def printProductList(products: List[String]): Unit = {
  for ((product, index) <- products.zipWithIndex) {
    println(s"${index + 1}- $product")
  }
}

// Function to get the total number of products
def getTotalProducts(products: List[String]): Int = {
  products.size
}
