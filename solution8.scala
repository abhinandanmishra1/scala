import scala.io.StdIn._
import scala.annotation.tailrec

object Main {
    /*
    Write a Scala program to check whether a given character is present in a String minimum 2 and maximum 4 times
    */
    
    def main(args: Array[String]): Unit = {
        var str = readLine();
        var strMap = str.groupBy(identity).mapValues(_.length);
        var ch = readChar();
        
        if(strMap(ch)>=2 && strMap(ch)<=4) {
            println("Yes")
        }else {
            println("No")
        }
    }
}
