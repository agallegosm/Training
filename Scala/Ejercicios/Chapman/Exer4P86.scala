
val palindrome: String = ""
val reversePal: String = ""
val isPal: Boolean = false

println("Write a line: ")
val palindrome = readLine()

val reversePal = palindrome.reverse
val isPal = if (palindrome == reversePal) true else false

println("In the capture line a palindrome : " + isPal)
