val amount = 1.0
amount match {
   case x if x > 0 => "greater"
   case x if x < 0 => "lesser"
   case x          => "equal"
}