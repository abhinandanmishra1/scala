import scala.io.StdIn._
object Main {
    /*
       Write a program to add two matrices of the same size
    */
    
    def main(args: Array[String]): Unit = {
        var n = readInt();
        
        var arr = Array.fill(n) {
            var row = readLine().split(" ").map(_.toInt);
            row
        }
        
        var brr = Array.fill(n) {
            var row = readLine().split(" ").map(_.toInt);
            row
        }
        
        var sum = Array.ofDim[Int](n, arr(0).length);
        
        for(i <- 0 until n) {
            for(j <- 0 until arr(i).length) {
                sum(i)(j) = arr(i)(j) + brr(i)(j);
            }
        }
        
        println("Sum of matrix")
        for(row <- sum) {
            println(row.mkString(" "));
        }
    }
}
