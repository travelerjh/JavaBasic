package ch15Collection.book.b15;

import java.util.LinkedList;
import java.util.Queue;

public class Ex {
    public static void main(String[] args) {
        Queue<Message> messageQueue =new LinkedList<>();
        messageQueue.offer(new Message("sendMail","홍길동"));
        messageQueue.offer(new Message("sendMS","신길동"));
        messageQueue.offer(new Message("sendKakao","양홍원"));

        while(!messageQueue.isEmpty()){
            Message message = messageQueue.poll();
            switch (message.command){
                case "sendMail":
                    System.out.println(message.to+"님께 메일을 보냅니다.");
                break;
                case "sendMS":
                    System.out.println(message.to+"님께 MS을 보냅니다.");
                break;
                case "sendKakao":
                    System.out.println(message.to+"님께 카카오를 보냅니다.");
                    break;

            }


        }


    }

}
