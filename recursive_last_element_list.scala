import scala.io.StdIn._
object Main {
    /*
        Write a recursive function to find the last element in a List.
    */
    def main(args: Array[String]): Unit = {
        var list = readLine().split(" ").map(_.toInt).toList
        
        def findLastElementRecur(list: List[Int]): Int = {
            if(list.isEmpty) {
                return -1;
            }else if(list.tail.isEmpty){
                return list.head;
            }else {
                findLastElementRecur(list.tail);
            }
        }
        
        println("last element of list is = " + findLastElementRecur(list))
    }
}
