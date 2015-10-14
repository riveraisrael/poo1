class Racional(n: Int, d: Int) {
  val numerador = n
  val denominador = d

  def sumar(b: Racional): Racional = {
    new Racional(
      numerador * b.denominador + denominador * b.numerador,
      denominador * b.denominador
    )
  }
  def restar(b:Racional): Racional = {
  	new Racional (
  		numerador*b.denominador - denominador * b.numerador,
  		denominador * b.denominador
  		)
  }
  def multiplicar(b:Racional): Racional = {
    new Racional (
      numerador* b.numerador,
      denominador * b.denominador
      )
  }
  def dividir(b:Racional): Racional = {
    new Racional (
      numerador * b.denominador,
      denominador* b.numerador
      
      )
  }

}

def SumaF () {
	print("Numerador de la primera fraccion: ")
val n1 = readInt()
print("Denominador de la primera fraccion: ")
val d1 = readInt()
val fraccion1 = new Racional(n1, d1)

print("Numerador de la segunda fraccion: ")
val n2 = readInt()
print("Denominador de la segunda fraccion: ")
val d2 = readInt()
val fraccion2 = new Racional(n2, d2)

val suma = fraccion1.sumar(fraccion2)

println("\t El resultado a tu operacion es: "suma.numerador + "/" + suma.denominador)
	
}
def RestaF()  {
	print("Numerador de la primera fraccion: ")
val n1 = readInt()
print("Denominador de la primera fraccion: ")
val d1 = readInt()
val fraccion1 = new Racional(n1, d1)

print("Numerador de la segunda fraccion: ")
val n2 = readInt()
print("Denominador de la segunda fraccion: ")
val d2 = readInt()
val fraccion2 = new Racional(n2, d2)

val resta = fraccion1.restar(fraccion2)

println("\t El resultado a tu operacion es: "resta.numerador + "/" + resta.denominador)
	
}
def MultiplicacionF()  {
  print("Numerador de la primera fraccion: ")
val n1 = readInt()
print("Denominador de la primera fraccion: ")
val d1 = readInt()
val fraccion1 = new Racional(n1, d1)

print("Numerador de la segunda fraccion: ")
val n2 = readInt()
print("Denominador de la segunda fraccion: ")
val d2 = readInt()
val fraccion2 = new Racional(n2, d2)

val multiplica = fraccion1.multiplicar(fraccion2)

println("\t El resultado a tu operacion es: "multiplica.numerador + "/" + multiplica.denominador)
  
}
def DivisionF()  {
  print("Numerador de la primera fraccion: ")
val n1 = readInt()
print("Denominador de la primera fraccion: ")
val d1 = readInt()
val fraccion1 = new Racional(n1, d1)

print("Numerador de la segunda fraccion: ")
val n2 = readInt()
print("Denominador de la segunda fraccion: ")
val d2 = readInt()
val fraccion2 = new Racional(n2, d2)

val divide = fraccion1.dividir(fraccion2)

println("\t El resultado a tu operacion es: "divide.numerador + "/" + divide.denominador)
  
}

println("\t que operacion quiere realizar con fracciones?")
println("\t 1) sumar")
println("\t 2) restar")
println("\t 3) multiplicar")
println("\t 4) dividir")

var opcion=readInt
opcion match {
	case 1 => SumaF()
	case 2 => RestaF()
  case 3 => MultiplicacionF()
  case 4 => DivisionF()
	case default => println("adios...")
}


