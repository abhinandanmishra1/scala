object Main {
    def main(args: Array[String]): Unit = {
        for(_ <- 1 to 10) {
            for(__ <- 1 to 10) {
                print("- ");
            }
            println()
        }
    }
}
