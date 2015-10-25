def Ejercicio1(){
	println("Ingrese el total de su compra: $")
val Compra=readFloat()

println("se aplicara un descuento de acuerdo a la bolita que saco")

println("blanca, no hay descuento")
println("verde, se aplica descuento de 10%")
println("amarilla, se aplica descuento de 25%")
println("azul, se aplica descuento de 50%")
println("roja, se aplica descuento de 100% ")
println("color de la bolita que saco: ")
val bola=readLine()


if(bola == "blanca"){
println ("No se le aplicara descuento, su total a pagar es: " + Compra )
}
if (bola == "verde"){
val Descuento=(Compra*.10)
println("Se le aplicara un descuento de 10%, su total a pagar es: $"+ Descuento)
}
if (bola == "amarilla"){
val Descuento=(Compra*.25)
println("Se le aplicara un descuento de 25%, su total a pagar es: $" + Descuento)
}
if (bola == "azul" ) {
val Descuento=(Compra*.50)
println("Se le aplicara un descuento de 50%, su total a pagar es: " + Descuento)
}
if (bola == "roja"){

println("Se le aplicara un descuento de 100%, Usted no pagara por sus compras, Felicidades " )
}
	
}

def Ejercicio2()  {
	println("Edad de la persona adscrita a jubilarse")
val Edad=readInt()
println("Antiguedad en su empleo de la persona adscrita a jubilarse")
val Antiguedad=readInt()
 if (Edad>= 60 && Antiguedad < 25){
 	println("El adscrito se jubilara por edad")
 } 
 else if(Edad < 60 && Antiguedad >= 25){
 	println("El adscrito se jubilara por antiguedad joven ")
 	}
 	else if (Edad>= 60 && Antiguedad >= 25) {
 		println("usted se jubilara por antiguedad adulta")

 	} 
	

}



 println("Elige uno de las opciones a ejecutar")
 println("1) Ejercicio 1, practica 3")
 println("2) Ejercicio 2, practica 3")
 

 val opcion=readInt()
 opcion match {
 	case 1 => Ejercicio1
 	case 2 => Ejercicio2
 	
 	case default => println("opcion invalida")
 }