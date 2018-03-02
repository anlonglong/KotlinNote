package com.infix

fun main(args: Array<String>) {
	println("${1 infixFun 2}")
	//int -->String
	val list = listOf<Int>(1,2,3)
	val tr = list.map { it: Int -> it.toString()+"a" }
	/**
	 ������������Ӧ�ĺ���ֻ��һ����������ʹ��ʱ������ʡ�Բ�������(��ͬ->)��ֱ��ʹ��it���������**/
	//val tr = list.map(it.toString()+"a") �ȼ��������һ��
	tr.forEach { println(it) }
	
	
	//String -- Int
	val tg = listOf("1","2")
	val h = tg.map { it:String -> it.toInt() }
	h.forEach { println(it is Int) }
    
	
}

fun isOdd(i:Int) = i % 2 !=0  //Int -- boolean
fun length(str:String) = str.length //String -- Int

val oddLen = compose(::isOdd,::length) //String -- boolean ���������ڲ���ʵ��

fun <A,B,C> compose(b : (B) ->C,a: (A) ->B):(A) ->C {
	//˼·:ֻ��b�������Լӹ���C����,��b��������ҪB���͵Ĳ���,��ǡ��a�������Բ���B���͵Ĳ���
	return { x ->b(a(x)) } //A����Ҫ����b�����ļӹ����c����
}





//��׺����
infix fun Int.infixFun(i: Int) = i + 1


//�߽׺���(�������߷���ֵ�Ǻ���)
fun <T, R> List<T>.map(transform: (T) -> R/**��T����ת����R����**/): List<R> {
	val listR = arrayListOf<R>()
	for (item in this) {
		listR.add(transform(item))
	}
	return listR
}
