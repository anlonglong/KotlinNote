package com.nest
class Foo:Base() {
	val f:Int = 10
	inner class FooInner {
		///�ڲ�������ⲿ�ุ���е�����.
		val i:Int = super@Foo.b
		
		fun ff() {
			//�ڲ�������ⲿ�ุ���еķ����ĸ�ʽ
			super@Foo.f()
			println("a= $f")
		}
	}
}
