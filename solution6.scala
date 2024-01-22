import scala.io.StdIn._
import scala.annotation.tailrec

object Main {
    /*
      Write a program to find the Tranpose of a Matrix.
    */
    
    def main(args: Array[String]): Unit = {
        var n = readInt();
        
        var arr = Array.fill(n) {
            var row = readLine().split(" ").map(_.toInt);
            row
        }
        
        arr = arr.transpose
        for(row <- arr) {
            println(row.mkString(" "))
        }
    }
}
