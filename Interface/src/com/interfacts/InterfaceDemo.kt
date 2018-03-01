package com.interfacts

val top: Int = 10


fun main(args: Array<String>) {
	val type : Int = 10
	val i = top
	test1()
	test2()
	Single.f()
	Companion.test()
	//�൱��java�е�������
	val r = object {
		fun f() {
			println("from sealed ${top} ${type}") //���ʷ�շ�Χ��ı���
		}
	}
}
//����������ķ�ʽ
//var t = object : base(),interface()...{ }

//�޼̳���ʵ�ֽӿڵĶ�����ʽ
fun test1() {
	val t = object {
		var text: String = "�޼̳���ʵ�ֽӿڵĶ�����ʽ"
        fun t() {
			
		}
	}

	println(t.text)

	val text = TextView()
	text.setOnClickListener(object : ClickListener {
		override fun click(i: Int) {
			println("i = $i")
		}
	})
	

	text.doClick()
}

//�м̳���ʵ�ֽӿڵĶ�����ʽ
fun test2() {
	var t = object : Base("�м̳еĶ�����ʽ"), Fun {
		override fun f() {
			println("�нӿڵĶ�����ʽ")
		}
	}
	println(t.i)
	t.f()

}

open class Base(str: String) {
	val i: String = str;

}

interface Fun {
	fun f()
}


/**
����������ķ�ʽvar t=object:���ࣨ��,�ӿ�����
ע��㣺

���Ǹ������й��췽��������������ʱ�򣬱��贫�ݲ���
������ӵ�ж������ʱ�򣬸���֮���ö��Ÿ���
���Դ������̳и��࣬Ҳ��ʵ�ֽӿڵ�������

 **/

//���õ����ķ�����ʽ:����.������ Single.f()
object Single : Fun {
	override fun f() {
		println("object�����ĵ�������")
	}
}


//��������
class Companion {
	companion object Test {
		@JvmStatic fun test() {
			println("�������ľ�̬ʹ��")
		}
	}
}
