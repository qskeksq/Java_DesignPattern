package mail;

import java.util.ArrayList;
import java.util.List;

public class Server implements IProxy {

	// ������ ������ �����ϴ� ����
	List<Mail> mails = new ArrayList<>();
	
	@Override
	public void sender(Mail mail) {
		
		System.out.println(mail + "�� �߼��Ͽ����ϴ�");
	}

	@Override
	public Mail get() {
		
		Mail mail = new Mail();
		return mail;
	}
	
	private void receiver(){
		
		// ������ ������ �׾Ƴ���
		mails.add(new Mail());
	}
	
	

}
