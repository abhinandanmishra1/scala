import scala.io.StdIn._
object Main {
    /*
    Write a Scala program to count the occurrences of substring in a given string. The substring is of length 4 and starts with 'ti' and ends with 'e'
    */
    def main(args: Array[String]): Unit = {
        var s = readLine();
        
        var count = 0;
        
        for(i <- 3 until s.length) {
            if(s(i) == 'e' && s(i-2) == 'i' && s(i-3) == 't') count+=1;
        }
        
        println(s"Count of substrings of length 4, starting with 'ti' and ending with 'e' is = ${count}")
    }
}
