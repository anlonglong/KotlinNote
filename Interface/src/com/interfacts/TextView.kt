package com.interfacts

import java.util.Random

class TextView {
	var listener:ClickListener?=null
	//ע��ص�����
	fun setOnClickListener( l: ClickListener?) {
		listener = l
	}
	
	fun doClick() {
		listener?.click(Random().nextInt())?:println("listener is null")
	}
	
}
