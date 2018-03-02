package com.infix

fun main(args: Array<String>) {
	println("${1 infixFun 2}")
	//int -->String
	val list = listOf<Int>(1,2,3)
	val tr = list.map { it: Int -> it.toString()+"a" }
	/**
	 若函数参数对应的函数只有一个参数，在使用时，可以省略参数定义(连同->)，直接使用it代替参数：**/
	//val tr = list.map(it.toString()+"a") 等价于上面的一句
	tr.forEach { println(it) }
	
	
	//String -- Int
	val tg = listOf("1","2")
	val h = tg.map { it:String -> it.toInt() }
	h.forEach { println(it is Int) }
    
	
}

fun isOdd(i:Int) = i % 2 !=0  //Int -- boolean
fun length(str:String) = str.length //String -- Int

val oddLen = compose(::isOdd,::length) //String -- boolean 看函数体内部的实现

fun <A,B,C> compose(b : (B) ->C,a: (A) ->B):(A) ->C {
	//思路:只有b函数可以加工出C类型,而b函数又需要B类型的参数,而恰巧a函数可以产出B类型的参数
	return { x ->b(a(x)) } //A类型要经过b函数的加工变成c类型
}





//中缀函数
infix fun Int.infixFun(i: Int) = i + 1


//高阶函数(参数或者返回值是函数)
fun <T, R> List<T>.map(transform: (T) -> R/**把T类型转换成R类型**/): List<R> {
	val listR = arrayListOf<R>()
	for (item in this) {
		listR.add(transform(item))
	}
	return listR
}
