println ("Primera Calificacion")
val calificacion1=readFloat()

println("Segunda Calificacion")
val calificacion2=readFloat()

println ("Tercera Calificacion")
val calificacion3=readFloat()

println ("Examen Final")
val ExamenFinal=readFloat()

println ("Trabajo  FInal")
val TrabajoFinal=readFloat ()

val Promedio=(calificacion1+calificacion2+calificacion3)/3
val Final=(Promedio*.55+ExamenFinal*.3+TrabajoFinal*.15)


println ("Calificacion "+ Final)
