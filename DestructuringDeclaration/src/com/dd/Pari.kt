
/**
 把一个对象成员解构(destructure)成多个变量,称为解构声明(destructuring declaration),
component1(),component2()等函数是Kotlin约定的操作符(类似+ - * / for等操作符)
componentN是操作符(类似加减乘除的运算符),重载操作符必需要用operator修饰以允许使用!
解构声明componentN函数的定义如下:
 **/
class Pari<K,V> constructor (val first:K,val second:V) {
	
	//component这个单词不能拼错,否则编译出错后面的数字可以是1到N
	operator fun component1():K {
		return first
	}
	//componentN是操作符,重载它,必须添加operator修饰符
	operator fun component2():V {
		return second
	}
}