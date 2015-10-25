def Ejercicio1(){
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
}

def Ejercicio2()  {
	println ("El costo de la pieza es $50,000")
println ("Ingresa la cantidad de piezas a comprar")
var NumeroPiezas=readInt()
var PrecioTotal=NumeroPiezas*50000
println ("El monto total a pagar es " + PrecioTotal)
if (PrecioTotal>500000){
	var Inversion= PrecioTotal*.55 
	var BancoPrestamo= PrecioTotal*.30
	var Credito=PrecioTotal*.15
	var Intereses=Credito*.20
	println ("La empresa tiene la capacidad de invertir: " + Inversion)
    println ("Se le solocitara un prestamo al banco de: " + BancoPrestamo)
    println ("El pago que se le hara a credito al fabricante es: "  + Credito)
    println ("Con un concepto de intereses de: "  + Intereses)

}
else {
	var Inversion= PrecioTotal*.70 
	var Credito=PrecioTotal*.30
	var Intereses=Credito*.20
	println ("La empresa tiene la capacidad de invertir: " + Inversion)
    println ("El pago que se le hara a credito al fabricante es: "  + Credito)
    println ("Con un concepto de intereses de:  " + Intereses)

}
	
	
}
 


 println("Elige uno de las opciones a ejecutar")
 println("1) Ejercicio 1, practica 2")
 println("2) Ejercicio 2, practica 2")
 

 val opcion=readInt()
 opcion match {
 	case 1 => Ejercicio1
 	case 2 => Ejercicio2
 	
 	case default => println("opcion invalida")
 }