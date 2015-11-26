 abstract class ProductoAPagar(
 protected  val nombre: String,
 protected val precio: Float,
 protected val cantidad: Int
) {
 def subtotal(): Double = {
 return precio * cantidad
 }
}
class Productos extends Iterable[ProductoAPagar] {
private val productosAPagar = new Array[ProductoAPagar](50)
  private var cantidadProductos = 0
def iterator(): Iterator[ProductoAPagar]= {
    return productosAPagar.slice(0, cantidadProductos).iterator
  }
def agregar(producto: ProductoAPagar){
	productosAPagar(cantidadProductos)= producto
	cantidadProductos += 1
 }
}

class Nota {
 private val productosAPagar = new Productos()
 def otro(producto: ProductoAPagar) {
 	productosAPagar.agregar(producto)
 
 }
 def total(): Double = {
 var total = 0.0
 for (producto <- productosAPagar) {
 total += producto.subtotal()
 }
  return total
}
}



