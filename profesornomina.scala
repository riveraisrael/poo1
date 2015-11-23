class Profesor(n: String)  {
	var horasAsesoria=0
	var nombre=n
	var categoria:String=""
	var horasClase = 0
	
	def categorizar(c: String) = {
		categoria = c
		categoria match {
			case "HC" =>{ horasClase=75;horasAsesoria=225}
			case "MT" =>{ horasClase=120;horasAsesoria=240}
			case "TC" =>{ horasClase=180;horasAsesoria=320}
		}
		
		
	}

}
class Nomina()  {
	val profesores= new Array[profesorPago](50)
	val profesoresPagos = 0
	def agregar(profesor: Profesor, hora: Int, a: Int)  {
		profesores(profesoresPagos)= new profesorPago(profesor, hora, a)
		profesoresPagos += 1
	}
	def pagonomina(): Double = {
		var totalnomina=0.0
        for (i<-0 to profesoresPagos -1){
        	totalnomina += profesores(i).PagoAsesoria()



        }
		return totalnomina
	}
}
class profesorPago(p:Profesor, h: Int, a:Int)  {
	val profesor = p
	val hora = h
	val horasAsesoria= a

	def PagoAsesoria(): Int = {
		var pago= hora * profesor.horasClase + horasAsesoria* profesor.horasAsesoria
		return pago
	}
	
}
var respuesta= 'n'
val nomina= new Nomina()
do{
println("----------------------------------------------------")
	println ("||==============Bienvenido===========||")
println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
  
  println("Ingresa el nombre del profesor : ")
  var nombre=readLine()
  val profesor=new Profesor(nombre)
  println("Ingrese la categoria del profesor:HC, MT o  TC ")
  var categoria = readLine()

  println("Cuantas horas de clase impartio?: ")
  var horasC = readInt()

  println("Cuantas horas de asesoria dio?: ")
  var horasA = readInt()
  profesor.categorizar(categoria)
  nomina.agregar(profesor,horasC,horasA)

  println(nombre + "|"+  categoria + "|" + horasC)
  
  println("Quieres agregar otra nomina? (s/n) ")
  respuesta=readChar()

  }
  	while (respuesta!='n')
  	println("Total a pagar: " + nomina.pagonomina())
