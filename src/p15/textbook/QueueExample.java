package p15.textbook;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> mQ = new LinkedList<>();

		mQ.offer(new Message("sendMail", "홍길동"));
		mQ.offer(new Message("sendSMS", "신용권"));
		mQ.offer(new Message("sendKakaotalk", "홍두께"));

		while (!mQ.isEmpty()) {
			Message message = mQ.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS을 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카톡을 보냅니다.");
				break;

			}
		}
	}
}
