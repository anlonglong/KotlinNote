package com.kt
class Test constructor() {
	
	lateinit var name : String
	
	
	constructor( age : Int) : this()
	
	
	fun printName() {
		println("name is $name")
	}
	
}

