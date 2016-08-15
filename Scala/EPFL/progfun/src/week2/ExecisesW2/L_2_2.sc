// Now using anonymous functions:
/* From Anonymous Functions
def sumIntsAF(a: Int, b: Int): Int       = sumHOF(x => x, a, b)

def sumCubesAF(a: Int, b: Int): Int      = sumHOF(x => x * x * x, a, b)

def sumFactorialAF(a: Int, b: Int): Int  = sumHOF(factHOF, a, b)
*/

def factHOF(x: Int): Int =
  if ( x == 0) 1 else x * factHOF(x - 1)


//Functions Returning Functions

// Lest's rewrite sum as follows


def sum(f: Int => Int): (Int, Int) => Int = {
  def sumF(a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sumF(a + 1, b)
  sumF
 }

// Now we can define:

def sumInts       = sum(x => x)

def sumCubes      = sum(x => x * x * x)

def sumFactorials = sum(factHOF)

// And use them

sumInts(1, 3)

sumCubes(1, 3)

sumFactorials(1, 3)

sumInts(1, 3) + sumCubes(1, 3) + sumFactorials(1, 3)

def cube(x: Int): Int = x * x * x

sum (cube) (1,10)

sumCubes(1, 10)

// Shorter sum definition

def sumShorter(f: Int => Int)(a: Int, b: Int): Int =
  if (a > b) 0 else f(a) + sumShorter(f)(a + 1, b)

sum(cube)(1, 10)

object exercise {
  def product(f: Int => Int)(a: Int, b: Int): Int =
        if (a > b) 1
    else f(a) * product(f)(a + 1, b)
    product(x => x * x)(3, 7)

  def fact(n: Int) = product(x => x)(1, n)
  fact(5)

  def mapReduce(f: Int => Int, combine: (Int, Int) =>
    Int, zero: Int)(a: Int, b: Int): Int =
    if (a > b) 0
    else combine(f(a), mapReduce(f, combine, zero)( a + 1, b))

}

// Using mapReduce to define

object sumMR {
  def mapReduce(f: Int => Int, combine: (Int, Int) =>
    Int, zero: Int)(a: Int, b: Int): Int =
    if (a > b) 0
    else combine(f(a), mapReduce(f, combine, zero)( a + 1, b))

  def productMR(f: Int => Int)(a: Int, b: Int): Int =
    mapReduce(f, (x, y) => x * y, 1)(a, b)

  def factMR(n: Int) = productMR(x => x)(1, n)
  factMR(5)
}