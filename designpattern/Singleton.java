package com.nadan.java.designpattern;

public class Singleton {
	
	// �ڱⰡ �ڱ� �����θ� ������
	private static Singleton sSingleton = null;
	
	// 1. �����ڿ� private
	private Singleton(){  }
	
	// 2. �ܺο��� ������ �� �����Ƿ� ���ο��� ������ �� ����� �� �ֵ��� �������̽��� �����ؾ� �Ѵ�.
	public static Singleton getInstance(){
		// null �̸� �����ؼ�, �̹� ������ ������ ��ü�� �Ѱ��ش�
		if(sSingleton == null){
			sSingleton = new Singleton();
		} 
		return sSingleton;
	}
	
	/** ���� */
	// ��Ƽ ������ ȯ�濡���� ������ ���� �� �ֱ� ������ static ���� �ٷ� new �� �� �� �ִ�
	// private static Singleton sSingleton = new Singleton();
	// db �� ���� �̷��� �� �� ���� ����. �ȵ���̵忡�� db �� context �� ����ϱ� ����
	
	

}
