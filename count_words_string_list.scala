import scala.io.StdIn._
object Main {
    /*
        Given a list of Strings, each containing at least one word, find the number of occurrences of each word from the list.
    */
    def main(args: Array[String]): Unit = {
        def input(): List[String] = {
            var lis = List[String]()
            while(true) {
                var x = readLine();

                if(x == Nil || x == "") return lis;
                
                lis ++= List(x);
            }
            
            lis
        }
        var map = input().flatMap(_.split(" ")).groupBy(identity).mapValues(_.length)
        
        println(map.mkString("\n"))
    }
}
