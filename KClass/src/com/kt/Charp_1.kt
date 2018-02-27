package com.kt

import java.io.File

const val TOP_VALUE_STR : String = "this is top value"

const val TOP_VALUE_INt : Int = 10

var top_pro : String = ""

val top_val : Int = 10

fun topFun() {
	println("this is top fun")
}


/**
 之所以返回值可以为null是因为,str的内容无确定是不是完全符合解析规则,有可能是"122sdn"类型的
 **/
fun parseInt_1(str: String):Int? {
	return@parseInt_1 try {
		str.toInt()
	}catch (e: NumberFormatException) {
		null
	}
}

//自己捕获异常
fun parseInt_2(str: String):Int? {
	try {
		return str.toInt()
	}catch(e : NumberFormatException) {
	    println("parse string containers illager character $str")
		return null
	}
}
//sdk自己处理
fun parseInt_3(str:String):Int? = str.toIntOrNull()

fun main(args: Array<String>) {
	println(TOP_VALUE_STR)
	
	val test = Test()
	test.name = "jack"
	test.printName()
    var arr : Array<Int>? =arrayOf(1,2)
	
	var len = (arr?.size)?:("this array is null") //
	println("len = $len")
	arr = null;
	len = (arr?.size)?:("this array is null") //
	println("len = $len")
}

