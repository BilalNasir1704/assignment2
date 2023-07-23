import kotlin.math.sqrt

fun main(){
    // solve the equation x2+10x+25=0 where x=(-b+sqrt(b2+4ac))/2a or x=(-b-sqrt(b2+4ac))/2a
    val a = 1
    val b = 10
    val c = 25
    val d = sqrt((b*b).toDouble() - (4*a*c).toDouble())
    val e = -b + d
    val f = -b - d
    val g = e/(2*a)
    val h = f/(2*a)
    val x_1 = g
    val x_2 = h
    println("The value of x is ${x_1} or ${x_2}")    
}