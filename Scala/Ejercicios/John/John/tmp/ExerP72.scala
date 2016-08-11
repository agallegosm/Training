class Person {
  var age = 0
  var name = ""
}

class Person01(var age: Int = 49, var name: String = "Agz")

var p = new Person01(50, "AGZ")

object oPer extends App {
  val p = new Person01(51,"ZGA")
  println(p.name + " is " + p.age)
}