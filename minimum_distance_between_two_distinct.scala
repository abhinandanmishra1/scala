import scala.io.StdIn._
import scala.collection.mutable.Map
object Main {
    /*
        Given a list of Strings, each containing at least one word, find the number of occurrences of each word from the list.
    */
    def main(args: Array[String]): Unit = {
        var arr = readLine().split(" ").map(_.toInt)
        
        var x = readInt()
        var y = readInt()
        
        var map = Map[Int, List[Int]]()
        
        for(i <- arr.indices) {
            var elem = arr(i);
            map(elem) = i::map.getOrElse(elem, Nil);
        }
        
        var ans = arr.length + 1;
        for(i <- map(x)) {
            for(j <- map(y)) {
                ans = Math.min(ans, Math.abs(i-j));
            }
        }
        
        if(ans == arr.length + 1) {
            println("No match found")
        }else {
            println(s"Minimum distance = ${ans}")
        }
    }
}
