package com.delegate
fun main(args: Array<String>) {
	val base = BaseImpl("baseImpl")
    Derived(base).print()
}


//Àà´úÀí
interface Base {
	fun print():Unit
}

class BaseImpl(val msg:String) : Base  {
	
   override	fun print() {
		print(msg)
	}
	 
}

class Derived (b:Base) :Base by b 
