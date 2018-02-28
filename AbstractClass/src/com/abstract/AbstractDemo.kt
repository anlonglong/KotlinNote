package com.abstract

fun main(args: Array<String>) {

}

//抽象方法和抽象属性只能出现在抽象类中,非抽象类中不能出现
abstract class Base {
	open fun f() {
		println("f ()")
	}
}


//无论抽象类,抽象方法或者抽象属性,抽象的子类必须重写,所以open关键字是默认有的
abstract class Activity : Base() {

	abstract var t: Int //抽象属性不能初始化
	override abstract fun f()

	fun Toast(str: String) {
		print("str = $str")
	}
}


//子类继承抽象父类必须重写抽象父类中抽象属性和抽象成员
class Fragment : Activity() {
	override var t: Int = 0
	override fun f() {
		super.Toast("fragment")
	}
}

//如果子类有追构造函数,可以在住构造函数中重写抽象类中的抽象属性
class Dialog(override var t: Int) : Activity() {
	override fun f() {

	}
}

/**
总结:
抽象类和普通类的主要有三点区别：
抽象方法必须为public或者protected（因为如果为private，则不能被子类继承，子类便无法实现该方法），
缺省情况下默认为public。
抽象类不能用来创建对象；
如果一个类继承于一个抽象类，则子类必须实现父类的抽象方法。
如果子类没有实现父类的抽象方法，则必须将子类也定义为为abstract类。
如果抽象类中含有抽象属性，再实现子类中必须将抽象属性初始化，除非子类也为抽象类。
 **/



