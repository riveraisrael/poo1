def Ejercicio1(){
	println ("Primera Calificacion")
val calificacion1=readFloat()

println("Segunda Calificacion")
val calificacion2=readFloat()

println ("Tercera Calificacion")
val calificacion3=readFloat()

println ("Examen Final")
val ExamenFinal=readFloat()

println ("Trabajo  FInal")
val TrabajoFinal=readFloat ()

val Promedio=(calificacion1+calificacion2+calificacion3)/3
val Final=(Promedio*.55+ExamenFinal*.3+TrabajoFinal*.15)


println ("Calificacion "+ Final)
}

def Ejercicio2()  {
	println ("Dame el presupuesto total")
val PresupuestoTotalAnual=readFloat()

val DineroGinecologia=(PresupuestoTotalAnual*.40)
val DineroTraumatologia=(PresupuestoTotalAnual*.30)
val DineroPediatria=(PresupuestoTotalAnual*.30)
println  ("el presupuesto de ginecologia es " + DineroGinecologia)
println  ("el presupuesto de traumatologia es " + DineroTraumatologia)
println  ("el presupuesto de pediatria es " + DineroPediatria)
	
}
 def Ejercicio3(){
 	println ("cantidad 1")
val cantidad1=readFloat()
println ("cantidad 2")
val cantidad2=readFloat()
println ("cantidad 3")
val cantidad3=readFloat()
 
 val total= cantidad1 + cantidad2 + cantidad3
 val porcentaje1= cantidad1*100/total
 println("primer porcentaje " + porcentaje1)
 val porcentaje2= cantidad2*100/total
 println("segundo porcentaje " + porcentaje2)
 val porcentaje3=cantidad3*100/total 
 println ("tercer porcentaje " + porcentaje3)
 }


 println("Elige uno de las opciones a ejecutar")
 println("1) Ejercicio 1, practica 1")
 println("2) Ejercicio 2, practica 1")
 println("3) Ejercicio 3, practica 1")

 val opcion=readInt()
 opcion match {
 	case 1 => Ejercicio1
 	case 2 => Ejercicio2
 	case 3 => Ejercicio3
 	case default => println("opcion invalida")
 }
 
