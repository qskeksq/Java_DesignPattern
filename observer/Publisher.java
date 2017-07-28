package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 발행자
 * @author Administrator
 *
 */
public class Publisher {
	
	// observer 저장소
	List<Observer> observers = new ArrayList<>();
	
	// observer 추가하는 함수
	public void addObserver(Observer obs){
		observers.add(obs);
	}
	
	// 자체 처리 함수
	public void process(){
		// 뭔가 일을 처리 하다가 이벤트 발생시
		while(true){
			notice();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	// 변경사항 알리기
	private void notice(){
		for(Observer observer : observers){
			observer.alarm();
		}
	}
	

}
