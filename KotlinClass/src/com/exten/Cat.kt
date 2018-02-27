package com.exten

class Cat: Animal {
	constructor (category: String, name: String): super(category)//去初始化父类的主构造函数
	constructor(category: String, name: String, age: Int) : super(category, name, age)//去初始化父类的二级造函数
	
	/**
	 子类要重写父类的方法是,父类的方法必须用哦open修饰,否则无法重写(父类的方法默认是用final修饰的),
	 并且子类要加override关键字修饰-------------------------
	 **/
	override fun eat(food:String) {
		println("$category eat $--------------food")
		super.birthday = "1111-11-11"
	}
	
	override var age:Int = 10//可以把父类的val属性重写为var属性
	//override val birthday = ""//反过来把var属性重写为val是不行的,
	//因为val已经定已过getter方法,如果重写为var类型,会额外的增加setterff
}
