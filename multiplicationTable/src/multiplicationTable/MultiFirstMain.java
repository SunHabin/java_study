package multiplicationTable;

import java.util.Scanner;

public class MultiFirstMain {

	public static void main(String[] args) {

//		���� �䱸���� 1
//		����ڰ� �Է��� ���� ���� ũ�Ⱑ �ٸ� �������� ����� ����Ѵ�.
//		���� ��� ����ڰ� 8�� �Է��ϸ� ���ȴ�, 19�� �Է��ϸ� �ʱ��ʱ���(2 * 1���� 19 * 19)�� ����� ����Ѵ�.
		
//		System.out.println("���ڸ� �Է��ϼ��� : ");
//		Scanner sc = new Scanner(System.in);
//		int number = sc.nextInt();
//		
//		for(int i = 2; i<= number; i++) {
//			for (int j = 1; j<=number; j++) {
//				System.out.println(i * j);
//			}
			
//		���� �䱸���� 2
//		����ڰ� �Է��� ���� ���� ũ�Ⱑ �ٸ� �������� ����� ����Ѵ�.
//		���� ��� ����ڰ� 8,7�� ���� ���ڿ��� �Է��ϸ� ��ĥ���� �����Ѵ�. ��ĥ���� 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 ���� �����ϴ� ���� �ǹ��Ѵ�.
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
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
