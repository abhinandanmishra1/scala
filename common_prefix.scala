import scala.io.StdIn._
object Main {
    /*
        Given a list of Strings, each containing at least one word, find the number of occurrences of each word from the list.
    */
    def main(args: Array[String]): Unit = {
        var n = readInt();
        var list = List[String]()
        
        while(n>0) {
            var x = readLine();
            
            list ++= List(x);
            
            n-=1;
        }
        
        def getPrefix(list: List[String]): String = {
            if(list.isEmpty) return "";
            if(list.tail.isEmpty) return list.head;
            
            var tailString = getPrefix(list.tail);
            var curr = list.head;
            var res = "";
            for(i <- 0 until Math.min(tailString.length, curr.length)) {
                if(curr(i) == tailString(i)) {
                    res += curr(i);
                }else {
                    return res;
                }
            }
            
            return res;
        }
        
        var res = getPrefix(list);
        
        if(res.length > 0) {
            println("Common Prefix: " + res)
        }
        else {
            println("No common prefix found")
        }
    }
}
