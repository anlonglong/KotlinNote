package com.nest

fun main(args: Array<String>) {

}
/**
 ��Kotlin�У�ʵ�ּ̳�ͨ����ѭ���¹���
 ���һ���������ֱ�Ӹ���(�ӿڻ��߻���)�̳���ͬһ����Ա(��Ա����)�Ķ��ʵ�֣�
 ��ô�����븴д�����Ա(����)�����ṩ�Լ���ʵ�֣����Ҫʹ�ø������ṩ�ķ�����
 ��super<Base>����ʾ
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


//kotlin�нӿ��еķ���������Ĭ�ϵ�ʵ��.������java8
interface C {
	fun f()          //���f()û�з����弴�����,��B����Ҫ����ʵ���Լ���f()
	//fun f() {}         //���f()�з�����,��B��Ҫ����ʵ���Լ���f()
	fun b() {
		println("C")
	}
	
}

class B : A(),C {
	
	override fun b() {
		println("B")
	}
	
	override fun f() {
		//����ֻ��ֱ�ӵ��ø����ʵ��
		super<A>.f()
		//super<C>.f() ��ʱC�е�f()�ǳ����,�޷�ֱ�ӵ���
	}
	
}
