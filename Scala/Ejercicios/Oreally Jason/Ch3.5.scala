for  (i <- 1 to 100){
     if ((i % 3 == 0) & (i % 5 == 0)) print("typesafe, ")
	 else if (i % 3 == 0) print("type, ")
	 else if (i % 5 == 0) print("safe, ")
	 else print(i + (", "))
}