import scala.io.StdIn._
import scala.collection.mutable.Map
object Main {
    /*
       You are given an array arr[] of N integers. The task is to find the smallest positive number missing from the array.
    */
    
    def getHash(str: String): String = {
        var count = Array.fill(26) {0};
        
        for(ch <- str) {
            count(ch.toInt - 97) += 1;
        }
        
        var hash = ""
        for(i<- 0 until 26) hash += count(i).toString;
        
        return hash;
    }
    def main(args: Array[String]): Unit = {
        var n = readInt()
        var arr = Array.fill(n) {
            readLine()
        }
        
        var mp = Map[String, List[String]]();
        
        for(elem <- arr) {
            var hash = getHash(elem);
            
            mp(hash) = elem::mp.getOrElse(hash, Nil);
        }
        
        println(mp.values.map(_.mkString(" ")).mkString("\n"))
    }
}
