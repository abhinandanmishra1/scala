import scala.io.StdIn._
object Main {
    /*
    Write a Scala function to check if a given number is a perfect square
    */
    def main(args: Array[String]): Unit = {
        var n = readInt();
        
        var lo = 0;
        var hi = n/2+1;
        
        while(lo<hi) {
            var mid = lo + (hi - lo)/2;
            
            if(mid*mid>=n) {
                hi = mid;
            }else {
                lo = mid + 1;
            }
        }
        
        if(lo*lo == n || (lo-1)*(lo-1) == n) {
            println(s"${n} is a perfect square");
        }else {
            println(s"${n} is not a perfect square");
        }
    }
}
