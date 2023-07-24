fun main(){
    println("Choices:\n\t1.Pizza\n\t2.Chicken\n\t3.Pancake\n\t4.Cake")

    println("Please enter your choice:__ ")
    val choice = readln().toString()
    if (choice == "1"){
        println("Go To PizzaHut")
    }else if (choice == "2"){
        println("Go To KFC")
    }else if (choice == "3"){
        println("Go To FoodHub")
    }else if (choice == "4"){
        println("Go To Cakely")
    }else {
        println("invalid choice")
    }
}