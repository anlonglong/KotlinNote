package com.enum

import java.lang.Boolean

fun main(args: Array<String>) {
	val left = Direction.LEFT;
    println(left.name)
	println(left.ordinal)
    println(left.code())
	//����Directionö�� ����1
	Direction.values().forEach { println(it.name) }
	println("-------------------------------------")
	////����Directionö�� ����2
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
	
	//�ж�str�ǲ���ö�ٳ����ܵ�ĳһ��
	fun fromValue_1(str:String):Direction {	
		return valueOf(str)
	}
	
 
	
	//��strת����ö��Direction
	//����1
	fun fromValue_2(str:String):Direction? {
		var dir :Direction? = null;
		try {
			dir = valueOf(str)
		}catch(e:Exception) {
			println("$str is can't belong to Direction")
		}
		return dir
	}
	
	//��strת����ö��Direction
	//����2 
	fun fromValue_3(str:String) = enumValueOf<Direction>(str)
	
}