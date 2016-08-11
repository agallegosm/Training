val totalSec = 123456

val totalMin = totalSec/60

val dispSec = totalSec%60

val dispMin = totalMin%60

val dispHour = totalMin/60

val dispTotal = dispHour+":"+dispMin+":"+dispSec

println()

val sec = dispSec.toString

val min = dispMin.toString

val min = "5"

val sec = "2"

val dispTotal = dispHour+":"+("0"*(2-min.length))+min+":"+(
                "0"*(2-sec.length))+sec
				
println()

val min = "10"

val operZero = "0"*(2-min.length)