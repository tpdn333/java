package p09.textbook.s09_04_01;

public class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}

}
