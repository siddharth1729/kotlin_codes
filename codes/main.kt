
class Dice(val sides:Int){
    fun Roll():Int{
        return (1..sides).random()
    }
}
fun main(){
    println("This is a ubaised dice!")
    val number=6
    val first = Dice(number)
    val result = first.Roll()
    val luckeynumber = (1..number).random()
    println("Your dice of sides ${first.sides} is rolled and the number is ${result}")
	println("your luckey number is ${luckeynumber}")
    if(luckeynumber == result){
        println("You Win!")
    }
    else{
        println("You didn't win, try again!!")
    }
}
