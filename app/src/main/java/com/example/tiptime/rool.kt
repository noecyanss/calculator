package com.example.tiptime

fun main(){
    val firstDice = Dice(12)
    val random = firstDice.roll()
    println(random)
}

class Dice(private val sides:Int){
    fun roll(): Int {
        return (1..sides).random()
    }
}

class Coin{
    fun coinTurnOn(){
        val random = (1..2).random()
        if(random == 1){
            println("正面")
        }else{
            println("反面")
        }
    }
}