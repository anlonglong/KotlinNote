package com.exten
class Dog(var kind:String) {
	//init代码块里面只能初始化主构造函数里面的属性
	init {
		kind = "中华田园犬"
	}
	
	constructor( kind:String , name : String):this(kind) {
		
	}
	init{
		kind = "中华田园犬"
		//name = ""//二级构造函数的属性无法初始化
	}
	
	
}
