
def sumInts(a: Int, b: Int): Int =
  if (a > b) 0 else a + sumInts(a + 1, b)

def cube(x: Int): Int = x * x * x

def sumCubes(a: Int, b: Int): Int =
  if (a > b) 0 else cube(a) + sumCubes(a + 1, b)


sumInts(1 , 3)

cube(2)

sumCubes(1 , 3)

def fact(n: Int): Int = {
  def loop(acc: Int, n: Int): Int =
    if (n == 0) acc
    else loop(acc * n, n -1)

  loop(1 , n)
}

def sumFactorial(a: Int, b: Int): Int =
  if(a > b) 0 else fact(a) + sumFactorial(a + 1, b)

fact(4)

sumFactorial(1 , 3)

// Summing with Higher-Order Functions

//Let's define:

def sumHOF(f: Int => Int, a: Int, b: Int): Int =
  if (a > b) 0
  else f(a) + sumHOF(f, a + 1, b)

def id(x: Int): Int = x

def cubeHOF(x: Int): Int = x * x * x

def factHOF(x: Int): Int =
  if ( x == 0) 1 else x * factHOF(x - 1)

// Now we can then write:

def sumIntsHOF(a: Int, b: Int): Int       = sumHOF(id, a, b)

def sumCubesHOF(a: Int, b: Int): Int      = sumHOF(cubeHOF, a, b)

def sumFactorialHOF(a: Int, b: Int): Int  = sumHOF(factHOF, a, b)

// We can calculate:


sumIntsHOF(1 , 3)

cubeHOF(2)

sumCubesHOF(1 , 3)

factHOF(4)

sumFactorial(1 , 3)

// Anonymous Funtion Syntax

(x: Int) => x * x * x

(x: Int, y: Int) => (x + y)


(3)

(1,3)

// Now using anonymous functions:

def sumIntsAF(a: Int, b: Int): Int       = sumHOF(x => x, a, b)

def sumCubesAF(a: Int, b: Int): Int      = sumHOF(x => x * x * x, a, b)

def sumFactorialAF(a: Int, b: Int): Int  = sumHOF(factHOF, a, b)

// We can calculate:


sumIntsAF(1 , 3)

cubeHOF(2)

sumCubesAF(1 , 3)

factHOF(4)

sumFactorial(1 , 3)


// Tail Recursion version of sum

/*def fact(n: Int): Int = {
  def loop(acc: Int, n: Int): Int =
    if (n == 0) acc
    else loop(acc * n, n -1)

  loop(1 , n)
} */

def sumTR(f: Int => Int, a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a + 1, f(a) + acc)
  }
  loop(1, 0)
}

sumTR(x => x * x, 1, 3)

sumTR(x => x, 1, 3)

sumTR(x => x + x, 1, 3)

sumTR(x => fact(x), 1, 3)