package com.nest

fun main(args: Array<String>) {

}
/**
 在Kotlin中，实现继承通常遵循如下规则：
 如果一个类从它的直接父类(接口或者基类)继承了同一个成员(成员函数)的多个实现，
 那么它必须复写这个成员(函数)并且提供自己的实现，如果要使用父类中提供的方法，
 用super<Base>来表示
 **/
open class A {
    val a:Int  = 10
	open fun f() {
       println("A")
	}
	
	fun e() {
		println("e")
	}
}


//kotlin中接口中的方法可以有默认的实现.类似于java8
interface C {
	fun f()          //如果f()没有方法体即抽象的,则B不需要重新实现自己的f()
	//fun f() {}         //如果f()有方法体,则B需要重新实现自己的f()
	fun b() {
		println("C")
	}
	
}

class B : A(),C {
	
	override fun b() {
		println("B")
	}
	
	override fun f() {
		//这里只是直接调用父类的实现
		super<A>.f()
		//super<C>.f() 此时C中的f()是抽象的,无法直接调用
	}
	
}
