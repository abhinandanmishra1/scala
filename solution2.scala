import scala.io.StdIn._
object Main {
    /*
        Write a program to find the index of an array element.
    */
    
    def main(args: Array[String]): Unit = {
        var n = scala.io.StdIn.readInt();
        var arr = Array.fill(n) {
            readInt()
        }
        
        val elem = readInt();
        
        println(s"Index of ${elem} is: " + arr.indexOf(elem));
    }
}
