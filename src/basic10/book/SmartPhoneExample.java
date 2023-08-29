package basic10.book;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone1 s1 = new SmartPhone1("갤럭시","은색");
        System.out.println("model"+s1.model);
        System.out.println("color"+s1.color);
        System.out.println("와이파이상태"+s1.wifi);

        s1.bell();
        s1.sendVoice("여보세요");
        s1.receiveVoice("안녕하세요 , 길동이입니다.");
        s1.sendVoice("아네 방갑습니다.");
        s1.hangUp();

        s1.setWifi(true);
        s1.internet();
    }
}
