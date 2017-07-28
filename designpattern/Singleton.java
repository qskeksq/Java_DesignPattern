package com.nadan.java.designpattern;

public class Singleton {
	
	// 자기가 자기 스스로를 가진다
	private static Singleton sSingleton = null;
	
	// 1. 생성자에 private
	private Singleton(){  }
	
	// 2. 외부에서 생성할 수 없으므로 내부에서 생성한 후 사용할 수 있도록 인터페이스를 제공해야 한다.
	public static Singleton getInstance(){
		// null 이면 생성해서, 이미 있으면 생성된 객체를 넘겨준다
		if(sSingleton == null){
			sSingleton = new Singleton();
		} 
		return sSingleton;
	}
	
	/** 참고 */
	// 멀티 스레드 환경에서는 오류가 생길 수 있기 때문에 static 에서 바로 new 를 할 수 있다
	// private static Singleton sSingleton = new Singleton();
	// db 의 경우는 이렇게 해 줄 수는 없음. 안드로이드에서 db 는 context 를 사용하기 때문
	
	

}
