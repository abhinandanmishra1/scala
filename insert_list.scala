import scala.io.StdIn._
object Main {
    /*
        Write a recursive function to find the last element in a List.
    */
    def main(args: Array[String]): Unit = {
        var list = readLine().split(" ").map(_.toInt).toList
        
        var newList = List[Int]();
        for(elem <- list) {
            newList++=List(elem, elem+1, elem+2);
        }
        
        println(newList.mkString(", "))
    }
}
