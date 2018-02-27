fun main(args: Array<String>) {
	
	//解构声明会创建多个变量,可独立使用
	var (f, s) = Pari(1, "a")
	println("first = $f,second = $s")
	//直接调用component函数
	val p = Pari(1,2)
	println("first = ${p.component1()},second = ${p.component2()}")
	//普通的调用方法.
	println("first = ${p.first},second = ${p.second}")
	val map =  mapOf(Pair(1,2))
	for((k,v) in map) {
		println("key = $k,value = $v")
	}
	
	//可以指定某一个参数的类型,也可以指定整个解构的类型
	map.mapValues { (_,v:Int):Map.Entry<Int,Int> ->"$v"  }
}