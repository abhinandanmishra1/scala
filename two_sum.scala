import scala.io.StdIn._
import scala.collection.mutable.Map
object Main {
    /*
       You are given an array arr[] of N integers. The task is to find the smallest positive number missing from the array.
    */
    def main(args: Array[String]): Unit = {
        var arr = readLine().split(" ").map(_.toInt).filter(x => x>0).sorted
        var k = readInt()
        var i = 0;
        var j = arr.length - 1
        
        while(i<j) {
            var sum = arr(i) + arr(j);
            if(sum>k) {
                j-= 1;
            }else if(sum<k) {
                i+=1;
            }else {
                println(s"Yes, there exists two number with sum ${k}");
                return;
            }
        }
        
        println(s"No, there are no two numbers present with sum ${k}")
    }
}
