package com.kt

class Person(var name:String,var age:Int) {
	//init�����ֻ��������ʼ��ס���캯��,�ι��캯���޷�ʹ��
	init{
		name = "default name"
		age = 0
	}
	
	constructor( name:String, age:Int, gender:String):this(name,age)
	init{
		name = "second default name"
		age = 2
		//gender = "man"����
	}
	
}