package com.exten

class Cat: Animal {
	constructor (category: String, name: String): super(category)//ȥ��ʼ������������캯��
	constructor(category: String, name: String, age: Int) : super(category, name, age)//ȥ��ʼ������Ķ����캯��
	
	/**
	 ����Ҫ��д����ķ�����,����ķ���������Ŷopen����,�����޷���д(����ķ���Ĭ������final���ε�),
	 ��������Ҫ��override�ؼ�������-------------------------
	 **/
	override fun eat(food:String) {
		println("$category eat $--------------food")
		super.birthday = "1111-11-11"
	}
	
	override var age:Int = 10//���԰Ѹ����val������дΪvar����
	//override val birthday = ""//��������var������дΪval�ǲ��е�,
	//��Ϊval�Ѿ����ѹ�getter����,�����дΪvar����,����������setterff
}
