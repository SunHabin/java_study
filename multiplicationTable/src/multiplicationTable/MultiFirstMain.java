package multiplicationTable;

import java.util.Scanner;

public class MultiFirstMain {

	public static void main(String[] args) {

//		최종 요구사항 1
//		사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
//		예를 들어 사용자가 8을 입력하면 팔팔단, 19를 입력하면 십구십구단(2 * 1에서 19 * 19)을 계산해 출력한다.
		
//		System.out.println("숫자를 입력하세요 : ");
//		Scanner sc = new Scanner(System.in);
//		int number = sc.nextInt();
//		
//		for(int i = 2; i<= number; i++) {
//			for (int j = 1; j<=number; j++) {
//				System.out.println(i * j);
//			}
			
//		최종 요구사항 2
//		사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
//		예를 들어 사용자가 8,7과 같은 문자열을 입력하면 팔칠단을 구현한다. 팔칠단은 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 까지 구현하는 것을 의미한다.
		
		System.out.println("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String inputValue = sc.nextLine();
		String[] number = inputValue.split(", ");
		int first = Integer.parseInt(number[0]);
		int second = Integer.parseInt(number[1]);
		
		for(int i = 2; i <= first; i++) {
			for (int j = 1; j <= second; j++) {
				System.out.println(i*j);
			}

		
		
		
		
	        }
	}
}
