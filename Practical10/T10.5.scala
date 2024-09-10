object LetterCount {
  def countLetterOccurrences(words: List[String]): Int = 
    words.map(_.length).sum
  
  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    val letterCount = countLetterOccurrences(words)
    println(s"Total number of letter occurrences: $letterCount")
  }
}