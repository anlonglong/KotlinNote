
/**
 ��һ�������Ա�⹹(destructure)�ɶ������,��Ϊ�⹹����(destructuring declaration),
component1(),component2()�Ⱥ�����KotlinԼ���Ĳ�����(����+ - * / for�Ȳ�����)
componentN�ǲ�����(���ƼӼ��˳��������),���ز���������Ҫ��operator����������ʹ��!
�⹹����componentN�����Ķ�������:
 **/
class Pari<K,V> constructor (val first:K,val second:V) {
	
	//component������ʲ���ƴ��,�����������������ֿ�����1��N
	operator fun component1():K {
		return first
	}
	//componentN�ǲ�����,������,�������operator���η�
	operator fun component2():V {
		return second
	}
}