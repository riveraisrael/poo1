class Profesor(n: String){
  val nombre=n
  var categoria: String = ""
  var precioHora: Double = 0.0
  var horasasesoria: Double = 0.0

  def categorizar(c: String) {
    categoria = c
    categoria match {
      case "HC" => {
        precioHora = 75
        horasasesoria = 75*3
      }
      case "MT" => {
        precioHora = 120
        horasasesoria = 120*2
      }
      case "TC" => {
        precioHora = 180
        horasasesoria = 180*2
      }
    }
  }
}

class Nomina(){
  val profesores= new Array[ProfesoresAPagar](50)
  var profesoresAPagar=0
  def pagar(profesor: Profesor, horasC: Int, horasA: Int){
     profesores(profesoresAPagar)= new ProfesoresAPagar(profesor, horasC, horasA)
     profesoresAPagar += 1
  }
  def totalAPagar(): Double = {
    var total=0.0
    for(i <-0 to profesoresAPagar - 1){
      total += profesores(i).pago()
    }
    return total
  }

}

class ProfesoresAPagar(p: Profesor, hC:Int, hA: Int){
  val profesor= p
  val horasPagarC=hC
  val horasPagarA=hA
  def pago(): Double = {
      var pago = profesor.precioHora * horasPagarC
      return pago + (profesor.horasasesoria*horasPagarA)
    }
}

var respuesta='n'
val nomina= new Nomina()

do{
  val profesor=new Profesor("")
  println("Nombre del profesor: ")
  var nombre=readLine()
  println (nombre)
  println("Categoria a la que pertenece el profesor: ")
  println("HC o  MT o  TC")
  var categoria=readLine()
  println(categoria) 
  println("Horas clase: ")
  var horasC=readInt()
  println (horasC)
  println("Horas asesoria: ")
  var horasA=readInt()
  println (horasA)
  profesor.categorizar(categoria)
  nomina.pagar(profesor, horasC, horasA)

  println("Quieres realizar la nomina de otro profesor? (s/n) ")
  respuesta=readChar()
}while(respuesta!='n')
println("El pago correspondiente es de :" + nomina.totalAPagar())
