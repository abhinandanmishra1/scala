import scala.io.StdIn._
object Main {
    /*
        Given a string str, convert the first letter of each word in the string to uppercase.
    */
    def main(args: Array[String]): Unit = {
        var str = readLine().split(" ").map(_.capitalize).mkString(" ");
        
        println(str)
    }
}
