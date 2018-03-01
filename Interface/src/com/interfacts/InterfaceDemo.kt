package com.interfacts

val top: Int = 10


fun main(args: Array<String>) {
	val type : Int = 10
	val i = top
	test1()
	test2()
	Single.f()
	Companion.test()
	//相当于java中的匿名类
	val r = object {
		fun f() {
			println("from sealed ${top} ${type}") //访问封闭范围外的变量
		}
	}
}
//创建匿名类的方式
//var t = object : base(),interface()...{ }

//无继承无实现接口的对象表达式
fun test1() {
	val t = object {
		var text: String = "无继承无实现接口的对象表达式"
        fun t() {
			
		}
	}

	println(t.text)

	val text = TextView()
	text.setOnClickListener(object : ClickListener {
		override fun click(i: Int) {
			println("i = $i")
		}
	})
	

	text.doClick()
}

//有继承有实现接口的对象表达式
fun test2() {
	var t = object : Base("有继承的对象表达式"), Fun {
		override fun f() {
			println("有接口的对象表达式")
		}
	}
	println(t.i)
	t.f()

}

open class Base(str: String) {
	val i: String = str;

}

interface Fun {
	fun f()
}


/**
创建匿名类的方式var t=object:父类（）,接口名。
注意点：

若是父类中有构造方法，创建匿名类时候，必需传递参数
匿名类拥有多个父类时候，父类之间用逗号隔开
可以创建不继承父类，也不实现接口的匿名类

 **/

//调用单利的方法格式:类名.方法民房 Single.f()
object Single : Fun {
	override fun f() {
		println("object声明的单利对象")
	}
}


//伴生对象
class Companion {
	companion object Test {
		@JvmStatic fun test() {
			println("伴随对象的静态使用")
		}
	}
}
