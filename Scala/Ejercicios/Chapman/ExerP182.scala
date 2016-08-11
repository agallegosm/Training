
println("Capture the numbers to add, press enter for each one, and write -sum- to finish: ")

def captureInt: List[Int] = {
	var myIntList: List = List[Int]()
	var inputInts: readLine()
	while(inputInts != "sum"){
		myIntList = inputInts.toInt :: myIntList
		inputInts = readLine()
	}
	 myIntList
}