package com.objdecl
//��������ǰ��object�ؼ��֣������ӵ��������������������������������Ǳ��ʽ��
//���Բ���ֱ�Ӹ�ֵ������,���Ҫ���ö�����ʽ����ķ���,������Signal.������.
object Signal {
	fun get(){
		//object innerObject {} �����������Ǿֲ���,Ҳ���ǲ������ں�����������
		outObject.f() //���Ե���
	}
	//����Ƕ������
	object outObject {
		fun f() {
			println("outObject")
		}
	}
}
