package com.kt

class Person(var name:String,var age:Int) {
	//init代码快只能用来初始化住构造函数中的参数,次构造函数无法使用在init代码夸中访问
	init{
		name = "default name"
		age = 0
	}
	
	constructor( name:String, age:Int, gender:String):this(name,age)
	init{
		name = "second default name"
		age = 2
		//gender = "man"报错
	}
	
}
