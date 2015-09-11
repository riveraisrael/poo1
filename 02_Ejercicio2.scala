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
