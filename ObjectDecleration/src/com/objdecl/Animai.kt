package com.objdecl
class Animal {
	
     fun println() {
		 println("from Animal")
		}
	
	object dog {
		
	}
	//��������,Cat���ֿ���ʡ��
	companion object Cat {
		
		//Animal.create().println()
		fun create() = Animal()
		
	}
	
//	companion object Dog {} һ����ֻ����һ����������
	
	
	//val x = Animal.Companion // ʡ�԰����������������,�Ѱ�����������ø�ֵ��x
	val x = Animal.Cat //δʡ�԰����������������, �Ѱ�����������ø�ֵ��x
}
