package com.nest
class Foo:Base() {
	val f:Int = 10
	inner class FooInner {
		///内部类访问外部类父类中的属性.
		val i:Int = super@Foo.b
		
		fun ff() {
			//内部类访问外部类父类中的方法的格式
			super@Foo.f()
			println("a= $f")
		}
	}
}
