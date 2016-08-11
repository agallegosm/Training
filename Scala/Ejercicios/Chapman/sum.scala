scala> List.tabulate(10)(i => i*i)
res0: List[Int] = List(0, 1, 4, 9, 16, 25, 36, 49, 64, 81)
scala> for(elem <- res0) {
| println(elem)
| }