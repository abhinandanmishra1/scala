import scala.io.StdIn._
object Main {
    /*
       Write a program to find common elements between two arrays (string values)
    */
    
    def main(args: Array[String]): Unit = {
        var n = readInt();
        var arr = Array.fill(n) {
            readInt()
        }
        
        var brr = Array.fill(n) {
            readInt()
        }
        
        val common = arr.intersect(brr);
        
        println("Common elemens are: " + common.mkString(", "));
    }
}
