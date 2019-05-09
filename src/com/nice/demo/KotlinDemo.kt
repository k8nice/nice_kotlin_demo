package com.nice.demo

class Nice(val name:String){
    fun greet(){
        println("nice,$name")
    }
}

fun main(args: Array<String>){
    Nice("宁海博").greet()
}

