
def Ejercicio1()  {
	var mayor=0
var menor=50
var promedio=0.0
var puntos = 0 
for( i<- 1 to 25) {
	print("ingresa el numero de puntos contaminantes del auto # "+ i +": ")
  puntos=readInt 
   promedio+=(puntos)/25
if (puntos< menor)
{
	menor=puntos
}
else {
	if (puntos>mayor){
    mayor=puntos
}}
}
println("el auto con mayor numero de puntos contaminantes es: " + mayor )
println("el auto con menor numero de puntos contaminantes es: " + menor )
println("el promedio de puntos contaminantes es: " + promedio )
	
}
 def Ejercicio2(){
 	

var metros = 0.0
var pino =  0.0
var oyamel =  0.0
var cedro =  0.0

print ("ingrese el numero de metros a reforestar ")
metros = readFloat 
if(metros > 1000000){

	println (" el bosque se reforestara de la siguiente manera...")
	println (" 70% de pino")
	println (" 20% de oyamel")
	println (" 10% de cedro")

	var porcentajepino= metros*.70
	pino= (porcentajepino/10)* 8
	var porcentajeoyamel=metros*.20
	oyamel = (porcentajeoyamel/15)*15
	var porcentajecedro=metros * .10
	cedro = (porcentajeoyamel/18)*10

	 

 
 println("se ocuparan   " + porcentajepino + "m2, para sembrar pino, en total se sembraran: " + pino + " pinos" )
  println("se ocuparan   " + porcentajeoyamel + "m2, para sembrar oyamel, en total se sembraran: " + oyamel + " oyameles " )
   println("se ocuparan   " + porcentajecedro + "m2, para sembrar cedro, en total se sembraran: " + cedro + " cedros" )

}

else
{
	println (" el bosque se reforestara de la siguiente manera...")
	println (" 50% de pino")
	println (" 30% de oyamel")
	println  (" 20% de cedro")

	var porcentajepino= metros*.50
	pino= (porcentajepino/10)* 8
	var porcentajeoyamel=metros*.30
	oyamel = (porcentajeoyamel/15)*15
	var porcentajecedro=metros * .20
	cedro = (porcentajeoyamel/18)*10
 
 println("se ocuparan   " + porcentajepino + "m2, para sembrar pino, en total se sembraran: " + pino + " pinos" )
  println("se ocuparan   " + porcentajeoyamel + "m2, para sembrar oyamel, en total se sembraran: " + oyamel + " oyameles " )
   println("se ocuparan   " + porcentajecedro + "m2, para sembrar cedro, en total se sembraran: " + cedro + " cedro" )

	
}

 }

  println("Elija un ejercicio que quiera ver ")
println("1) Ejercicio 1 ")
println("2) Ejercicio 2")


val opcion = readInt()

opcion match{
         case 1 => Ejercicio1()
         case 2 => Ejercicio2()
        
         case default => println(" no hay esa opcion ")
}
