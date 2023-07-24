fun main(){
    println("Choices:\n\t1.Pizza\n\t2.Chicken\n\t3.Pancake\n\t4.Cake")

    println("Please enter your choice:__ ")
    val choice = readln().toString()
    when (choice){
    "1" -> println("Go To PizzaHut")
    "2" -> println("Go To KFC")
    "3" -> println("Go To FoodHub")
    "4" -> println("Go To Cakely")
    else -> println("invalid")
    }
}