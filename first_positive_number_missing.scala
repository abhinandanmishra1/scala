import scala.io.StdIn._
import scala.collection.mutable.Map
object Main {
    /*
       You are given an array arr[] of N integers. The task is to find the smallest positive number missing from the array.
    */
    def main(args: Array[String]): Unit = {
        var arr = readLine().split(" ").map(_.toInt).filter(x => x>0).sorted
        
        for(i <- 1 to arr.length) {
            if(arr(i-1) != i) {
                println(i);
                return;
            }
        }
        
        println(arr.length+1)
    }
}
