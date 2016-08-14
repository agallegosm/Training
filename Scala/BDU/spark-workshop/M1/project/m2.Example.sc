import java.sql.Time

class Hello

val Hi = new Hello()

Hi.toString

def Hellox = "Hello"

def echo(message: String): String = message

echo("just passing message")

echo(_)

"Martin Odersky".split(" ")

"Martin Odersky" split(" ")


def name(first: String = "", last: String = "void"): String =
    first + " " + last

name("Martin")

def nameMixture(first: String,
                last: String,
                middle: String = "void"): String =
  first + " " + middle + " " + last

nameMixture("John", "Doe")

def namedArguments(first: String = "", last: String = "void"): String =
  first + " " + last

namedArguments(last = "Odersky")

namedArguments(first = "Martin")

namedArguments(first = "Martin", last = "Odersky")

object Hii {
  def message = "Alo!"
}

Hii.message

object Hix {
  def oneHourInMinutes: Int = 60

  def createTimeFromMinutes(minutes: Int) =
    new Time(
      minutes / oneHourInMinutes,
      minutes % oneHourInMinutes)
}

object Hello {
  def main(args: Array[String]): Unit =
    println("Hello!")
}

