package com.nest
class Foo:Base() {
	val f:Int = 10
	inner class FooInner {
		///�ڲ�������ⲿ�ุ���е�����.
		val i:Int = super@Foo.b //�ڲ����޷���ȡ�ⲻ�������.
		
		fun ff() {
			//�ڲ�������ⲿ�ุ���еķ����ĸ�ʽ
			super@Foo.f()
			println("a= $f")
		}
	}
	
	class Nest {
		//val n : Int = this@Foo.f Ƕ�����޷���ȡ�ⲻ�������.
		fun nest() {
			println("f =")
		}
	}
}
