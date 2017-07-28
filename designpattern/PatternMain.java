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
		// 여기가 클라이언트
		
//		//Server mailServer = new Server();
//		Proxy proxy = new Proxy();
//		
//		Mail mail = new Mail();
//		
//		proxy.sender(mail);
//		
//		
//		// 공장 건설
//		FactoryMethod factory = new TVFactory();
//		Product product = factory.make();
		
		
		// 발행자 생성
		Publisher publisher = new Publisher();
		
//		publisher.addObserver(new Subscriber("홍길동"));
//		publisher.addObserver(new Subscriber("이순신"));
//		publisher.addObserver(new Subscriber("아무개"));
		
		// 이렇게 해 줄 수도 있고, 이게 좀 더 향상된 방식인 것이
		// 구독자가 끝내는 경우 발행자가 모르기 때문이다.
		new Subscriber("홍길동", publisher);
		new Subscriber("이순신", publisher);
		new Subscriber("아무개", publisher);
		
		
		publisher.process();
		
		
	}

}
