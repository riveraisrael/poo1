println("Elija un ejercicio que quiera ver ")
println("1) Ejercicio 1 ")
println("2) Ejercicio 2")
println("3) Ejercicio 3")
println("4) Ejercicio 4")

val opcion = readInt()

opcion match{
         case 1 => e1()
         case 2 => e2()
         case 3 => e3()
         case 4 => e4()
         case default => println(" no hay esa opcion ")
}
def e1() {
	var numero = 0.0
var cantidadpositivos = 0
var cantidadnegativos = 0
var cantidadneutros = 0

for (i <- 1 to 20){
    println( (i) + ") Ingresa un numero ya sea positivo o negativo o neutro ")
    numero=readFloat()

if (numero >0){
    cantidadpositivos +=1
}else if (numero < 0){
    cantidadnegativos +=1
}else{
    cantidadneutros +=1
}
}
println("Ingresaste " + cantidadpositivos + " numeros positivos")
println("Ingresaste " + cantidadnegativos + " numeros negativos")
println("Ingresaste " + cantidadneutros + " numeros neutros")
	
}
def e2(){
var menor = 11.0
var calificacion = 0.0
 for (i <- 1 to 40) 
{
 
println((i) + ") Ingresa tu calificacion")
 calificacion = readFloat()
 

if(calificacion < menor){
    menor = calificacion
 }
} 
println("La calificacion menor es: " + menor)
}
def e3(){
println ("Reloj")
 for (horas <- 0 to 23){
      for (minutos <- 0 to 59){
           for (segundos <- 0 to 59){
 
println(horas + ":" + minutos + ":" + segundos )

}
}
}
}
def e4(){
var kilos = 0.0
var totalcliente = 0.0
var totaltienda = 0.0

println("Cuanto cuesta el kilo de naranja?")
val preciokilo = readFloat()

for (i <- 1 to 15) {
    println("cuantos kilos compraste?")
    kilos=readFloat()
    totalcliente= preciokilo * kilos

if (kilos > 10){
   totalcliente = totalcliente * .85
}
   totaltienda = totalcliente
println("Vas a pagar: " + totalcliente)
}
println("La tienda va a recibir: " + totaltienda)
}