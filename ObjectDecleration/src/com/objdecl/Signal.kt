package com.objdecl
//在名字面前加object关键字，这样子的声明叫做对象声明，对象声明不算是表达式。
//所以不能直接赋值给变量,如果要调用对象表达式里面的方法,可以用Signal.方法名.
object Signal {
	fun get(){
		//object innerObject {} 对象声明不是局部的,也就是不可以在函数体中声明
		outObject.f() //可以调用
	}
	//可以嵌套声明
	object outObject {
		fun f() {
			println("outObject")
		}
	}
}
