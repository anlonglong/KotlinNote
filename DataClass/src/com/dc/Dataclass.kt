package com.dc
fun main(args: Array<String>) {
	val (name,age) = getPerson()
	println("name = $name age = $age")
}

fun getPerson() = Person("jack",25)

data class Person(var name:String,var age:Int)
