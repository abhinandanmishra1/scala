import scala.io.StdIn._
import scala.annotation.tailrec
object Main {
    /*
      Write a program to find Factorial of a Number
    */
    
    def main(args: Array[String]): Unit = {
        var n = readInt();
      
        @tailrec def factorial(n: Int, fact: Int = 1): Int = {
            if(n == 0) return fact;
            
            factorial(n-1, fact*n);
        }
        
        println("Factorial of number is "+ factorial(n));
    }
}
