package rpn.calculator

import scala.util.Try

class RpnCalculator {

  private var accumulator: List[Double] = List[Double]()

  def calculate(input: String): Option[Double] = {
    val result = input.split(" ").foldLeft(accumulator)((rest, head) => {
      head match {
        case "+" => doBinaryOperation(rest, _ + _)
        case "-" => doBinaryOperation(rest, _ - _)
        case "*" => doBinaryOperation(rest, _ * _)
        case "/" => doBinaryOperation(rest, _ / _)
        case _ => rest :+ Try {
          head.toDouble
        }.toOption.getOrElse(0.0)
      }
    }).lastOption

    accumulator = accumulator :+ result.getOrElse(0.0)
    result
  }

  private def doBinaryOperation(operands: List[Double], operation:(Double, Double) => Double): List[Double] = {
    operands.dropRight(2) :+ operation(operands.dropRight(1).last, operands.last)
  }
}
