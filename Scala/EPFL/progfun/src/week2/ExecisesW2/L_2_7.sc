object rationals {
  val x = new Rational(1,2)
  val y = new Rational(2, 3)
  val z = new Rational(4, 5)

  x.numer
  x.denom

  y.numer
  y.denom

  z.numer
  z.denom

  x + y

  // x - y - z
  x - y - z

  y + y

  x < y

  x max y

  new Rational(2)
}

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be different to zero")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  /*private val g = gcd(x, y)
    def numer = x / g
    def denom = y / g */

  // Better
  val numer = x / gcd(x, y)
  val denom = y / gcd(x, y)

  def addRational(r: Rational, s: Rational): Rational =
    new Rational(
      r.numer * s.denom + r.denom * s.numer,
      r.denom * s.denom)

  def subRational(r: Rational, s: Rational): Rational =
    new Rational(
      r.numer * s.denom - s.numer * r.denom,
      r.denom * s.numer)

  def mulRational(r: Rational, s: Rational): Rational =
    new Rational(
      r.numer * s.numer,
      r.denom * s.denom)

  def divRational(r: Rational, s: Rational): Rational =
    new Rational(
      r.numer * s.denom,
      r.denom * s.numer)

  def makeRationalString(r: Rational) =
    numer + "/" + denom

  makeRationalString(addRational(new Rational(1, 2),
    new Rational(2, 3)))

  def + (that: Rational) =
    new Rational(
      numer * that.denom + denom * that.numer,
      denom * that.denom)

// Put a space between '-' and ':'
  def unary_- : Rational = new Rational(-numer, denom)

  def - (that: Rational) = this + -that

  override def toString = numer + "/" + denom

  def < (that: Rational) =
    numer * that.denom < denom * that.numer

  def lessSelfRefenced(that: Rational) =
    this.numer * that.denom < this.denom * that.numer

  def max(that: Rational) = if (this < that) that else this

}

// Provided a fully parenthesize versio of
// a + b ^? c ?^ d less a ==> b | c
// ((a + b) ^? (c ?^ d)) less ((a ==> b) | c)