import scala.io.StdIn._
object Main {
    /*
    Write a Scala program to reverse every word in a given string
    */
    def main(args: Array[String]): Unit = {
        var str = readLine();
        
        var reversedAllWords = str.split(" ").map(_.reverse).mkString(" ");
        
        println(reversedAllWords);
    }
}
