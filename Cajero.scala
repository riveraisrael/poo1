var nombre = new Array[String](50)
var precio = new Array[Float](50)
var codigos = new Array[String](50)
var opcion = 3
var i=0
catalogo()

def catalogo(){
	do{
		mostrarMenuPrincipal()
		opcion= readInt()
		opcion match {
	    case 1 => agregarProductos()
		case 2 => mostrarNota()
        case default =>println("Adios...")
		}
		} while (opcion!=3)
        }
def mostrarNota() {
                var otro='N'
                var totalNota = 0.0
                do { 
                mostrarCatalogoProductos
                println("ingrese el numero de producto")
                var producto=readInt()
                println("Cantidad de productos")
                var cantidad=readInt()
                totalNota += precio(producto + 1)*cantidad
                println("Total a pagar " + totalNota)
                println("quiere agregar otro producto a la venta? ")
                otro=readChar()
                }while (otro !='N')
                
                 }

def mostrarMenuPrincipal(){
        	println("1) Agregar productos ")
        	println("2) Nota ")
        	println("3) Salir ")
        	              }

def agregarProductos() {
        	var continuar='N'
        	do{
            i=i+1
            capturarDatosProducto()
        	mostrarCatalogoProductos()
        	println("quieres agregar otro producto (S/N")
        	continuar=readChar()
            } while (continuar== 'S')
        	}

def capturarDatosProducto() {
        	println("Capturar datos del producto")
        	println("Nombre")
        	nombre(i)=readLine()
        	println("precio")
            precio(i)=readFloat()
            println("codigo de barras")
            codigos(i)=readLine()
            }

def mostrarCatalogoProductos()  {
        	println("No.Producto | Nombre |  Precio  | Codigo ")
        	for( j <- 0 to i) {
        	println((j+1) + "|" + nombre(j) + " | " + precio(j) + " | " + codigos(j))
        	}	
        	}

        	
        


