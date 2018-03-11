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
	fun lack(k: K) //此时K只能作为参数类型,不能作为返回值类型
	// fun klh() : K 不能作为返回值类型
}


interface Allon<out T> {
	fun f_1(): T //此时泛型只能作为返回值的类型,不能作为参数的类型

	//fun f_2(t:T) 不能作为参数的类型
}

class Frank<out F>(f: F) {

	val type: F = f

	fun f_1(): F {
		println(type)
		return type
	}
}

//泛型限定
class GenType<T : Frank<T>> {
	
}


interface MyFun<in T, out U> {
    fun testp(t: T): U
    fun inParam(t: T)
    fun outValue(): U
}

fun test11(m: MyFun<*, String>) {//in 声明成*, 表示 in Nothing  即不能写入任何东西，因为此时不知道*是什么类型的
    //m.testp("")
    //m.inParam("")
    m.outValue()
}

fun test12(m: MyFun<Int, *>) {//out 声明成*，表示 out U
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
 当不知道in的类型时，用 *表示 in类型， 可以安全地 防止 写入 
  out是读取的动作，用*表示，与原意一样
 **/
