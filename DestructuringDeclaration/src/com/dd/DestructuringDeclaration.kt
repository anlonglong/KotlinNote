fun main(args: Array<String>) {
	
	//�⹹�����ᴴ���������,�ɶ���ʹ��
	var (f, s) = Pari(1, "a")
	println("first = $f,second = $s")
	//ֱ�ӵ���component����
	val p = Pari(1,2)
	println("first = ${p.component1()},second = ${p.component2()}")
	//��ͨ�ĵ��÷���.
	println("first = ${p.first},second = ${p.second}")
	val map =  mapOf(Pair(1,2))
	for((k,v) in map) {
		println("key = $k,value = $v")
	}
	
	//����ָ��ĳһ������������,Ҳ����ָ�������⹹������
	map.mapValues { (_,v:Int):Map.Entry<Int,Int> ->"$v"  }
}