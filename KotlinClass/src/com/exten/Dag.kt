package com.exten
class Dog(var kind:String) {
	//init���������ֻ�ܳ�ʼ�������캯�����������
	init {
		kind = "�л���԰Ȯ"
	}
	
	constructor( kind:String , name : String):this(kind) {
		
	}
	init{
		kind = "�л���԰Ȯ"
		//name = ""//�������캯���������޷���ʼ��
	}
	
	
}
