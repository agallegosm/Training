// Tail recursion
def gcd(a: Int, b: Int): Int =
  if (b==0) a else gcd(b,a % b)

gcd(14,21)

//No Tail recusion
// def factorial(n: Int): Int =
//  if (n==0) 1 else n * factorial(n - 1)

// factorial(5)

//Tail recursion
object exercise {
  def factorial(n: Int): Int = {
    def loop(acc: Int, n: Int): Int =
      if (n == 0) acc
      else loop(acc * n, n -1)

    loop(1, n)
  }
  factorial(4)
}



