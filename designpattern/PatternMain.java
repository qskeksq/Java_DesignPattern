package com.nadan.java.designpattern;


import factorymethod.FactoryMethod;
import factorymethod.Product;
import factorymethod.TVFactory;
import mail.Mail;
import mail.Proxy;
import mail.Server;
import observer.Publisher;
import observer.Subscriber;

public class PatternMain {

	public static void main(String[] args) {
		// ���Ⱑ Ŭ���̾�Ʈ
		
//		//Server mailServer = new Server();
//		Proxy proxy = new Proxy();
//		
//		Mail mail = new Mail();
//		
//		proxy.sender(mail);
//		
//		
//		// ���� �Ǽ�
//		FactoryMethod factory = new TVFactory();
//		Product product = factory.make();
		
		
		// ������ ����
		Publisher publisher = new Publisher();
		
//		publisher.addObserver(new Subscriber("ȫ�浿"));
//		publisher.addObserver(new Subscriber("�̼���"));
//		publisher.addObserver(new Subscriber("�ƹ���"));
		
		// �̷��� �� �� ���� �ְ�, �̰� �� �� ���� ����� ����
		// �����ڰ� ������ ��� �����ڰ� �𸣱� �����̴�.
		new Subscriber("ȫ�浿", publisher);
		new Subscriber("�̼���", publisher);
		new Subscriber("�ƹ���", publisher);
		
		
		publisher.process();
		
		
	}

}
