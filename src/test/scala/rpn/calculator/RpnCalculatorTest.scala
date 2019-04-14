package rpn.calculator

import org.scalatest.{FlatSpec, Matchers, OptionValues}


class RpnCalculatorTest extends FlatSpec with Matchers with OptionValues {


  "calculator" should "be able to calculate single digit numbers" in {
    val calculator = new RpnCalculator()
    calculator.calculate("5 8 +").value should equal(13)
  }

  it should "be able to calculate negative operation" in {
    val calculator = new RpnCalculator()
    calculator.calculate("-3").value should equal(-3)
  }

  it should "be able to calculate multiple negative operation" in {
    val calculator = new RpnCalculator()
    calculator.calculate("-3 -2 *").value should equal(6)
  }

  it should "be able to calculate multiple operations" in {
    val calculator = new RpnCalculator()
    calculator.calculate("-3 -2 * 5 +").value should equal(11)
  }

  it should "be able to calculate multiple operations in right order" in {
    val calculator = new RpnCalculator()
    calculator.calculate("5 9 1 - /").value should equal(0.625)
  }

  it should "be able to handle negative numbers" in {
    val calculator = new RpnCalculator()
    calculator.calculate("-10 2 /").value should equal(-5)
  }

  it should "be able to calculate more complex notations" in {
    val calculator = new RpnCalculator()
    calculator.calculate("1 2 + 4 * 5 + 3 -").value should equal(14)
  }

}
