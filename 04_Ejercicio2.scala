
var edad=0.0
var ceroauno=0
var unotres=0
var tresmas=0
opciones()

def opciones(){
	mostrarMenuPrincipal()
	var opcion=readInt
	opcion match {
		case 1 => Elefantes()
		case 2 => Jirafas()
		case 3 => Chimpances()
		case default => println("adios")
	}
	
	
}



def mostrarMenuPrincipal() {
  println("1) Examinar Elefantes")
  println("2) Examinar Jirafas")
  println("3) Examinar Chimpances")
  println("4) Salir")
}
def Elefantes(){
  for( i <- 1 to 20) {
  	print("ingrese la edad del elefante no." + i + ": ")
  	edad=readFloat 
  	if (edad > 0 && edad <= 1){
    ceroauno +=1
}else if ( edad > 1 && edad < 3 ){
    unotres +=1
}else{
    tresmas +=1
}
  	}
println("Hay  " + ceroauno + "  elefantes menores de un año")
println("Hay " + unotres + " elefantes mayores de un año y menores de 3 años")
println("Hay " + tresmas + " elefantes mayores de tres años")
  }
def Jirafas()  {
	for( i <- 1 to 15) {
  	print("ingrese la edad de la jirafa no." + i + ": ")
  	edad=readFloat 
  	if (edad > 0 && edad <= 1){
    ceroauno +=1
}else if ( edad > 1 && edad < 3 ){
    unotres +=1
}else{
    tresmas +=1
}
  	}
println("Hay  " + ceroauno + "  jirafas menores de un año")
println("Hay " + unotres + " jirafas mayores de un  año y menores de tres años")
println("Hay " + tresmas + " jirafas mayores de tres años")
	
}
def Chimpances()  {
	for( i <- 1 to 40) {
  	print("ingrese la edad del chimpance no." + i + ": ")
  	edad=readFloat 
  	if (edad > 0 && edad <= 1){
    ceroauno +=1
}else if ( edad > 1 && edad < 3 ){
    unotres +=1
}else{
    tresmas +=1
}
  	}
println("Hay  " + ceroauno + "  chimpances menores de un año")
println("Hay " + unotres + " chimpances mayores de un  año y menores de tres años")
println("Hay " + tresmas + " chimpances mayores de tres años")
	
}



	
