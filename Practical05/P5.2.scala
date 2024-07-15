import scala.io.StdIn.readLine
import scala.util.{Try, Success, Failure}

case class Book(title: String, author: String, isbn: String)

// Initial Library Collection
var library_new: Set[Book] = Set(
  Book("1984", "George Orwell", "1234567890"),
  Book("To Kill a Mockingbird", "Harper Lee", "1234567891"),
  Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567892")
)

// add a new book to the library
def addBook(): Unit = {
  println("Enter details for the new book:")
  val title = readLine("Title: ")
  val author = readLine("Author: ")
  val isbn = readLine("ISBN: ")
  val newBook = Book(title, author, isbn)
  library_new += newBook
  println(s"Book added: ${newBook.title}")
}

// remove a book from the library by its ISBN
def removeBook(): Unit = {
  val isbn = readLine("Enter ISBN of the book to remove: ")
  val bookToRemove = library_new.find(_.isbn == isbn)
  bookToRemove match {
    case Some(book) =>
      library_new -= book
      println(s"Book removed: ${book.title}")
    case None => println("Book not found.")
  }
}

// if a book is already in the library by its ISBN
def isBookInLibrary(isbn: String): Boolean = {
  library_new.exists(_.isbn == isbn)
}

// display the current library collection with details of each book
def displayLibrary(): Unit = {
  if (library_new.isEmpty) {
    println("The library is empty.")
  } else {
    println("Current Library Collection:")
    library_new.foreach(book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"))
  }
}

// search for a book by its title and display its details if found
def searchBookByTitle(): Unit = {
  val title = readLine("Enter title of the book to search: ")
  val book = library_new.find(_.title.equalsIgnoreCase(title))
  book match {
    case Some(b) => println(s"Book found: Title: ${b.title}, Author: ${b.author}, ISBN: ${b.isbn}")
    case None => println("Book not found.")
  }
}

// display all books by a specific author
def displayBooksByAuthor(): Unit = {
  val author = readLine("Enter author's name to display books: ")
  val booksByAuthor = library_new.filter(_.author.equalsIgnoreCase(author))
  if (booksByAuthor.isEmpty) {
    println(s"No books found by author: $author")
  } else {
    println(s"Books by $author:")
    booksByAuthor.foreach(book => println(s"Title: ${book.title}, ISBN: ${book.isbn}"))
  }
}

// print all books in the library
def printAllBooks(): Unit = {
  if (library_new.isEmpty) {
    println("The library is empty.")
  } else {
    println("Current Library Collection:")
    library_new.foreach(book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"))
  }
}

// run the program
@main def main(): Unit = {
  var run = true
  while (run) {
    println("\nSelect an option:")
    println("1. Add a new book")
    println("2. Remove a book by ISBN")
    println("3. Check if a book is in the library by ISBN")
    println("4. Display the current library collection")
    println("5. Search for a book by title")
    println("6. Display books by a specific author")
    println("7. View all Books")
    println("8. Exit")

    // val choice = readLine("Enter your choice: ").toInt

    val choice = Try(readLine("Enter your choice: ").toInt) match {
      case Success(value) => value
      case Failure(_) => -1  // Invalid choice
    }
    
    choice match {
      case 1 => addBook()
      case 2 => removeBook()
      case 3 =>
        val isbn = readLine("Enter ISBN to check: ")
        println(s"Is book with ISBN $isbn in library? ${isBookInLibrary(isbn)}")
      case 4 => displayLibrary()
      case 5 => searchBookByTitle()
      case 6 => displayBooksByAuthor()
      case 7 => printAllBooks()
      case 8 => run = false; println("Exiting...")
      case _ => println("Invalid choice. Please enter a number between 1 and 7.")
    }
  }
}
