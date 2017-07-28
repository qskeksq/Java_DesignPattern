package observer;

/**
 * ������
 * @author Administrator
 *
 */
public class Subscriber implements Observer {

	Publisher publisher;  // ��� �������̽��� ����
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
		
		System.out.println(name + "��������� �ֽ��ϴ�");
	}
	
	
	public void finish(){
		
		
	}
	
	

}
