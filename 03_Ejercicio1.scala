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