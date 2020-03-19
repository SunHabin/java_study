package pjtTest;

public class mainClass {
	
	public static void main(String[] args) {
		
		// 서식문자
		System.out.println("오늘의 기온은 10도 입니다.");
		System.out.printf("오늘의 기온은 %d 입니다.\n", 10);
		
		int num1 = 20;
		System.out.println("오늘의 기온은 20도 입니다.");
		System.out.printf("오늘의 기온은 %d 입니다.\n", num1);
		
		int  num2 = 30;
		System.out.printf("오늘의 기온은 %d 입니다.\n", num2);
		System.out.printf("오늘의 기온은 %o 입니다.\n", num2);
		System.out.printf("오늘의 기온은 %x 입니다.\n", num2);
	
		System.out.printf("문자열 : %s\n", "java");
		
		System.out.printf("문자 : %c\n", 'c');
		
		float f = 1.23f;
		double d = 1.23456;
		
		System.out.printf("실수 %f \t %f", f, d);
		
	
	}
}
