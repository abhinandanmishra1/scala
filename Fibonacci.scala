import scala.io.StdIn._
object Main {
    def main(args: Array[String]): Unit = {
        var n = readInt();
        
        var a = 0;
        var b = 1;
        var c = 0;
        while(n>0) {
            print(a+ " ");
            c = a + b;
            a = b;
            b = c;
            n -=1;
        }
    }
}
