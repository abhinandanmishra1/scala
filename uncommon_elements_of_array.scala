import scala.io.StdIn._
object Main {
    /*
        You're given two arrays. Find the uncommon elements in both the arrays.
    */
    def main(args: Array[String]): Unit = {
        var arr1 = readLine().split(" ").map(_.toInt);
        var arr2 = readLine().split(" ").map(_.toInt);
        
        var uncommon1 = arr1.diff(arr2);
        var uncommon2 = arr2.diff(arr1);
        
        println("Uncommon elements in arr1 = "+ uncommon1.mkString(", "));
         println("Uncommon elements in arr2 = "+ uncommon2.mkString(", "));
    }
}
