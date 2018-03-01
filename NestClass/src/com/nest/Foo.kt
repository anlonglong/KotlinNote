package com.nest
class Foo:Base() {
	val f:Int = 10
	inner class FooInner {
		///内部类访问外部类父类中的属性.
		val i:Int = super@Foo.b //内部类无法获取外不类的引用.
		
		fun ff() {
			//内部类访问外部类父类中的方法的格式
			super@Foo.f()
			println("a= $f")
		}
	}
	
	class Nest {
		//val n : Int = this@Foo.f 嵌套类无法获取外不类的引用.
		fun nest() {
			println("f =")
		}
	}
}
