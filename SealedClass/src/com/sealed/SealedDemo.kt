package com.sealed

fun main(args: Array<String>) {
 
	//val seal = Sealed() 密封类是不能实例化的
	var p = Sealed.Person()
	p.f()
	println(p.member)
	val a = Sealed.Animal()
	a.f()
	println(a.member)
	
	println("-------------------------")
	
	//类似于多态
	var s :Sealed? = null
	s = Sealed.Animal()
	
	println(p.member)
	s = Sealed.Person()

	println(p.member)
	
	Sealed.add.member
    
	println("-------------")
	println(seal(a))
}

fun seal(s:Sealed) = when(s){
	is Sealed.Animal -> "a"
	is Sealed.Person -> "p"
	is Sealed.add -> "add"
	is Thing -> "th"
}

sealed class Sealed {
	
	var member:Sealed? = null
	get() = this
	set(value){
		println("set")
		field = if(value is Animal) Animal() else Person()
	}
	 
	//密封类的子类可以在其内部定义也可以在密封类的外面定义
	class Person:Sealed() {
		fun f() {
			println("person")
		}
	}
	
	class Animal:Sealed() {
		fun f() {
			println("animal")
		}
	}
	
	object add:Sealed()
	
}
//外部定义
class Thing:Sealed() {
	
}
