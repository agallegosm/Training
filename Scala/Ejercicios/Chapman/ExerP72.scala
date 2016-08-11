val custAge: Int = 0
var costAge: Int = 0
val prefer: Char = 'x'
val custom: Boolean = false
val customBoth: Boolean = false
var costMinor: Int = 20
var costMayor: Int = 35
var cost: Int = 0
var costC: Int = 5
var costW: Int = 10
var costB: Int = 15
var costTotal: Int = 0

print("What is the customer age? ")
val custAge = readInt()
println()

print("Do yuo want a cooler, or water park or both? (C or W or B)")
val prefer = readChar()
println()

val custom = if(prefer == ('c' | 'C')) true else false
val customBoth = if(prefer == ('b' | 'B')) true else false

println(prefer)
println(custom)
println(customBoth)
println()
println()
println()

// Imperative approach var cost: Int = 20 if(custAge >= 13) cost = 35
//Funtional approach

var costAge = (if(custAge<13) costMinor else costMayor)
var costTotal = {if (customBoth) (costAge += costB) else { 
		         if(custom) (costAge += costC) else (costAge += costW)
			    }
				}
println()
println(costAge)				
println(costAge += costB)
println(costAge += costC)
println(costAge += costW)
println()

println("The ticket cost is: " + costAge)