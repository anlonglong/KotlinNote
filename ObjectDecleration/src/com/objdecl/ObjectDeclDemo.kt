package com.objdecl
fun main(args: Array<String>) {
	
	val cons = Constant.WINDOWS
	
	//可以通过类名做限定符调用
	Animal.create().println()
	Animal().x.create().println()//两种调用伴生对象中的方法的方式
	
}
