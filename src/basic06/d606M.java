package basic06;

import java.util.Scanner;

public class d606M {

	public static void main(String[] args) {
		d606c d6= new d606c();
		d606l dl= new d606l();			
		d606d dd = new d606d();
	
		Scanner sc = new Scanner(System.in);
		String 	ani ;
		String anis ;

		while (true) {

		
		System.out.println("좋아하는 동물이 있습니까?");
	
		String who = sc.next();
		System.out.printf("당신은 %s 를 좋아하는군요 \n", who);

		for(int i=1;i<4;i++) {
    		 if (who.equals("강아지")) {
				System.out.println("강아지 이름과 울음소리를 적어주세요 ");
				dd.dog(ani = sc.next(), anis = sc.next());
				dd.play("꼬리 흔들기 ", "멍멍짖기");
				dd.like();
			} else if (who.equals("고양이")) {
				System.out.println("고양이 이름과 울음소리를 적어주세요 ");
				d6.run(ani = sc.next(), anis = sc.next());
				d6.qwer("애교부리기");
			} else if (who.equals("호랑이")) {
				System.out.println("호랑이 이름과 울음소리를 적어주세요 ");
				dl.ho(ani = sc.next(), anis = sc.next());
			}
	
		System.out.println("또 다른 동물을 좋아하나요 ?");
		String y = sc.next();
			if(y.equals("yes")) {
				
				continue;
			}else {
				break;
			}
		}
		
		}
		
	
	}
}

