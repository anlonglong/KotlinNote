package com.gen.type

fun main(args: Array<String>) {
	val f = Frank<Int>(0)
	println(f.f_1())
}

fun copy(from: Array<out String>, to: Array<in String>) {
	assert(from.size == to.size)
	for (str in from) {
		to.plus(str)
	}
}

interface Jack<in K> {
	fun lack(k: K) //��ʱKֻ����Ϊ��������,������Ϊ����ֵ����
	// fun klh() : K ������Ϊ����ֵ����
}


interface Allon<out T> {
	fun f_1(): T //��ʱ����ֻ����Ϊ����ֵ������,������Ϊ����������

	//fun f_2(t:T) ������Ϊ����������
}

class Frank<out F>(f: F) {

	val type: F = f

	fun f_1(): F {
		println(type)
		return type
	}
}

//�����޶�
class GenType<T : Frank<T>> {
	
}


interface MyFun<in T, out U> {
    fun testp(t: T): U
    fun inParam(t: T)
    fun outValue(): U
}

fun test11(m: MyFun<*, String>) {//in ������*, ��ʾ in Nothing  ������д���κζ�������Ϊ��ʱ��֪��*��ʲô���͵�
    //m.testp("")
    //m.inParam("")
    m.outValue()
}

fun test12(m: MyFun<Int, *>) {//out ������*����ʾ out U
    val result = m.testp(33)
    println("test12: " + result)
    m.inParam(34)
   val u =  m.outValue()
}

fun test13(m: MyFun<*, *>) {// <in Nothing, out U>
//    m.testp()
//    m.inParam()
    m.outValue()
}

/**
 ����֪��in������ʱ���� *��ʾ in���ͣ� ���԰�ȫ�� ��ֹ д�� 
  out�Ƕ�ȡ�Ķ�������*��ʾ����ԭ��һ��
 **/
