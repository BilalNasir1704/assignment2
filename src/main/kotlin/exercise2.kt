import kotlin.math.sqrt
fun main(){
    //speed is 1000m/s at an acceleration of 25m/s/s
    val speed:Float = 10000f
    val acc:Float = 25f
    val dist:Float = 5000f // in metres from kilometres
    //u- velocity, t-time, a-acc, s-dist
    //using eqn: s = (u*t) + (at2)/2 -->  10000 = 2000t + 25t2;
    //t2 + 80t = 400 --> a=1, b=80 , c=400 --> time = (-b + sqrt(b2 + 4ac))/2a 0r = (-b - sqrt(b2 + 4ac))/2a
    val t3 = ((80*80)+(4*18*400))
    val t3s = sqrt(t3.toFloat())
    val t2a = -80+t3s
    val t2b = -80-t3s
    val t1a = (t2a)/2
    val t1b = (t2b)/2
    println("time is either ${t1a} or ${t1b}")

    println("Since time cant be negative, then the time = ${t1a}s")


    //print("${time}  ")
}