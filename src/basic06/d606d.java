package basic06;

public class d606d  extends d606{
	
	String age;
	String[] like = {"놀기","먹기","자기"};

	void play(String a,String b) {
		System.out.printf("나의 특징 %s,%s 입니다",a,b);
	}
	
	void like() {
		System.out.println("\n 강아지가 좋아하는 것듯 ");
		System.out.println("---------------------");
		for(int i=0; i<=like.length;i++) {
		System.out.printf("%d.%s\n",i+1,like[i]);
		}	
	}
	

	
}