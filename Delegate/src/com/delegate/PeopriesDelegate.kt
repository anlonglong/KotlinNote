package com.delegate

import kotlin.reflect.KProperty
import kotlin.properties.Delegates


//���Դ���
fun main(args: Array<String>) {

	val  e = Example()
	
	println(e.p)
	e.p = "hello world"
	println(e.p)
	println("-----------------------")
	
	//lazy��ϵͳ����õĴ���ؼ���
	val s: String by lazy {
		 println("computed!")  
         "Hello" 
	}
	
//	for(i in arrayOf(1,1,1,1,1)) {
//		println(s)
//	}
	
	val u = Person()
	u.name = "first"
	u.name = "second"
	u.name = "thrid"
	
	println("-----------------------")
	
	val loca = Location(mapOf("lat" to 10, "lon" to 20))
	println("${loca.lat}")
}

class Example {
	var p:String by Delegate()
}

class Person {
	var name : String by Delegates.observable("initValue") {
		_,oldValue,newValue -> 
		println("oldVlaue = $oldValue,newValue = $newValue")
	
	}
}

class Location(val map : Map<String,Int>) {
	val lat:Int by map
	val lon:Int by map
}


//�Զ��������

class Delegate {

	
	//operator�ؼ����Ǳ����
	operator  fun getValue(thisRef: Any?, property: KProperty<*>): String {
		return "$thisRef, thank you for delegating '${property.name}' to me!"
	}
	//operator�ؼ����Ǳ����
	operator  fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
		println("$value has been assigned to '${property.name} in $thisRef.'")
	}

}