package com.enum

import java.lang.Boolean

fun main(args: Array<String>) {
	val left = Direction.LEFT;
    println(left.name)
	println(left.ordinal)
    println(left.code())
	//遍历Direction枚举 方法1
	Direction.values().forEach { println(it.name) }
	println("-------------------------------------")
	////遍历Direction枚举 方法2
	println(enumValues<Direction>().joinToString() {it.name})
	
	println(enumValueOf<Direction>("LEFT")) //
}


enum class Direction(var code:Int) {
	LEFT(0) {
		override fun code():Int{
			println("left")
			return code
		}
	},
	RIGHT(1) {
		override fun code():Int{
			println("right")
			return@code code
		}
	},
	TOP(2) {
		override fun code():Int{
			println("top")
			return code
		}
	},
	DOWN(3) {
		override fun code():Int{
			println("down")
			return code
		}
	};
	
	abstract fun code():Int
	
	//判断str是不是枚举常量总的某一个
	fun fromValue_1(str:String):Direction {	
		return valueOf(str)
	}
	
 
	
	//把str转换成枚举Direction
	//方法1
	fun fromValue_2(str:String):Direction? {
		var dir :Direction? = null;
		try {
			dir = valueOf(str)
		}catch(e:Exception) {
			println("$str is can't belong to Direction")
		}
		return dir
	}
	
	//把str转换成枚举Direction
	//方法2 
	fun fromValue_3(str:String) = enumValueOf<Direction>(str)
	
}