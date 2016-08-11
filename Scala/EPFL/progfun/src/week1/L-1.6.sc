/* object L_1_6A {

  3 + 4

  // Newton-Raphson way
  def abs(x: Double) = if (x < 0) -x else x

  def sqrt(x: Double): Double = {

    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def isGoodEnough(guess: Double, x: Double): Boolean =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double, x: Double): Double =
      (guess + x / guess) / 2

  sqrtIter(1.0, x)
  }

  sqrt(2)
  sqrt(4)
  sqrt(3.14159)
  sqrt(1e-6)
  sqrt(19e6)
}

*/

object L_1_6B {
  val x = 10
  def f(y: Int) = y + 1
  val result = {
    val x = f(3)
      x * x
  } + x
}