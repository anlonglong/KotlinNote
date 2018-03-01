package com.objdecl
class Animal {
	
     fun println() {
		 println("from Animal")
		}
	
	object dog {
		
	}
	//伴生对象,Cat名字可以省略
	companion object Cat {
		
		//Animal.create().println()
		fun create() = Animal()
		
	}
	
//	companion object Dog {} 一个类只能有一个伴生对象
	
	
	//val x = Animal.Companion // 省略伴生对象名的情况下,把伴生对象的引用赋值给x
	val x = Animal.Cat //未省略伴生对象名的情况下, 把伴生对象的引用赋值给x
}
