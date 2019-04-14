package rpn.calculator

import scala.io.StdIn.readLine


object Main {
  def main(args: Array[String]): Unit = {

    var input = ""
    var calculator = new RpnCalculator()
    do {
      input = readLine()
      if (input != "q") {
        try {
          System.out.println(calculator.calculate(input).get)
        } catch {
          case ex: java.lang.NullPointerException => {
            System.exit(0)
          }
          case _: Exception => {
            calculator = new RpnCalculator()
            System.out.println("""Application failed because of wrong input and started again with empty stack""")
          }
        }
      }

    } while (input != "q")

  }
}
