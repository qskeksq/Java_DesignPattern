package observer;

/**
 * 구독자
 * @author Administrator
 *
 */
public class Subscriber implements Observer {

	Publisher publisher;  // 사실 인터페이스를 받음
	String name;
	
	public Subscriber(String name, Publisher publisher){
		this.publisher = publisher; 
		this.name = name;
		publisher.addObserver(this);
	}
	
	@Override
	public void alarm() {
		
		showEvent();
	}
	
	private void showEvent(){
		
		System.out.println(name + "변경사항이 있습니다");
	}
	
	
	public void finish(){
		
		
	}
	
	

}
