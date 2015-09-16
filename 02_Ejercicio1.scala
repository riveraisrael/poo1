println ("ingresar las horas trabajadas por el obrero")
val HorasTrabajadas=readFloat

if  (HorasTrabajadas<=40){
  val salario=HorasTrabajadas* 160
  println("se le pagara al empleado $160 por hora, el salario total es: " + salario)
}
else {
	val HorasExtra=HorasTrabajadas- 40 
	 val SalarioTotal=HorasExtra *200 + 6400

	println ("Se le pagara al  empleado $160 las primeras 40 horas y cada hora extra $200, la cantidad que se le pagara es:  " + SalarioTotal)

}