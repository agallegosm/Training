object rationals {
  val x = new Rational(1,2)
  val y = new Rational(2, 3)
  val z = new Rational(2, 3)
  x.numer
  x.denom

  y.numer
  y.denom

  z.numer
  z.denom

  x.add(y)

  // x - y - z
  x.sub(y).sub(z)
}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y

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

def add(that: Rational) =
  new Rational(
    numer * that.denom + denom * that.numer,
    denom * that.denom)

def neg: Rational = new Rational(-numer, denom)

def sub(that: Rational) = add(that.neg)

override def toString = numer + "/" + denom
}