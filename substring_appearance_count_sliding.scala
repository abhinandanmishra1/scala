import scala.io.StdIn._
object Main {
    /*
    Write a Scala program to check if the number of appearances of two substrings in a string are equal.
    */
    def main(args: Array[String]): Unit = {
        var s = readLine();
        var sub1 = readLine();
        var sub2 = readLine();
        
        var count1 = s.sliding(sub1.length).count(window => window==sub1);
        var count2 = s.sliding(sub2.length).count(window => window == sub2);
        
        if(count1 == count2) {
            println("Yes, number of appearances of two substrings in a string are equal");
        }else {
            println("No, number of appearances of two substrings in a string are not equal");
        }
    }
}
