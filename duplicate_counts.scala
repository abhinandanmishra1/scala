import scala.io.StdIn._
object Main {
    /*
    Write a Scala program to count and print all the duplicates in the input string.
    */
    def main(args: Array[String]): Unit = {
        var str = readLine();
        
        var reversedAllWords = str.groupBy(identity).mapValues(_.length).filter(x => x._1 != ' ' && x._2>1);
        
        println(reversedAllWords.mkString("\n"));
    }
}
