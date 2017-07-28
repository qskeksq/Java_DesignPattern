package mail;

import java.util.ArrayList;
import java.util.List;

public class Server implements IProxy {

	// 수신한 메일을 저장하는 공간
	List<Mail> mails = new ArrayList<>();
	
	@Override
	public void sender(Mail mail) {
		
		System.out.println(mail + "을 발송하였습니다");
	}

	@Override
	public Mail get() {
		
		Mail mail = new Mail();
		return mail;
	}
	
	private void receiver(){
		
		// 메일을 받으면 쌓아놓음
		mails.add(new Mail());
	}
	
	

}
