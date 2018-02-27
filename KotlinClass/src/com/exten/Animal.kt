package com.exten
open class Animal(var category:String) {

	constructor(category: String, name: String, age: Int):this(category)
	
	
	open fun eat(food:String) {
		println("$category eat $food")
	}
	
	open val age:Int = 0
	open var birthday = "xxxx-xx-xx"
}
