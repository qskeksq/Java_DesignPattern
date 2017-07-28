package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ������
 * @author Administrator
 *
 */
public class Publisher {
	
	// observer �����
	List<Observer> observers = new ArrayList<>();
	
	// observer �߰��ϴ� �Լ�
	public void addObserver(Observer obs){
		observers.add(obs);
	}
	
	// ��ü ó�� �Լ�
	public void process(){
		// ���� ���� ó�� �ϴٰ� �̺�Ʈ �߻���
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
	
	
	// ������� �˸���
	private void notice(){
		for(Observer observer : observers){
			observer.alarm();
		}
	}
	

}
