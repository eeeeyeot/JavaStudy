package Java5_ppt63;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx
{
	public static void main(String[] args)
	{
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "김자바"));
		messageQueue.offer(new Message("sendKakaoTalk", "홍두께"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS를 보냅니다.");
					break;
				case "sendKakaoTalk":
					System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
					break;
			}
		}
	}
}

class Message {
	String command;
	String to;
	
	Message(String msg, String to){
		this.command = msg;
		this.to = to;
	}
}
