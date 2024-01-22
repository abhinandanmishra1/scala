import scala.io.StdIn._
import scala.annotation.tailrec

object Main {
    /*
      Write a program that finds numbers greater than the average of an array
    */
    
    def main(args: Array[String]): Unit = {
        var n = readInt();
        
        var arr = readLine().split(" ").map(_.toInt)
        
        var average = arr.sum / n;
        
        var filteredArr = arr.filter(a => a>average);
        
        println(filteredArr.mkString(" "))
    }
}
