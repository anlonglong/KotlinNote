package com.abstract

fun main(args: Array<String>) {

}

//���󷽷��ͳ�������ֻ�ܳ����ڳ�������,�ǳ������в��ܳ���
abstract class Base {
	open fun f() {
		println("f ()")
	}
}


//���۳�����,���󷽷����߳�������,��������������д,����open�ؼ�����Ĭ���е�
abstract class Activity : Base() {

	abstract var t: Int //�������Բ��ܳ�ʼ��
	override abstract fun f()

	fun Toast(str: String) {
		print("str = $str")
	}
}


//����̳г����������д�������г������Ժͳ����Ա
class Fragment : Activity() {
	override var t: Int = 0
	override fun f() {
		super.Toast("fragment")
	}
}

//���������׷���캯��,������ס���캯������д�������еĳ�������
class Dialog(override var t: Int) : Activity() {
	override fun f() {

	}
}

/**
�ܽ�:
���������ͨ�����Ҫ����������
���󷽷�����Ϊpublic����protected����Ϊ���Ϊprivate�����ܱ�����̳У�������޷�ʵ�ָ÷�������
ȱʡ�����Ĭ��Ϊpublic��
�����಻��������������
���һ����̳���һ�������࣬���������ʵ�ָ���ĳ��󷽷���
�������û��ʵ�ָ���ĳ��󷽷�������뽫����Ҳ����ΪΪabstract�ࡣ
����������к��г������ԣ���ʵ�������б��뽫�������Գ�ʼ������������ҲΪ�����ࡣ
 **/



