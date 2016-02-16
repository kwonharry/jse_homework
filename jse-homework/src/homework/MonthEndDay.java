package homework;

import java.util.Scanner;

public class MonthEndDay {
	/*
	 * 월을 입력하면 해당 월의 끝날이 몇일인지 출력하는 프로그램 단, 2월은 29일로 입력 주의점: 입력값이 1~12를 넘어서면 잘못입력
	 * sw
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("몇 월달입니까?");
		int month=scanner.nextInt();
		
		
		int end=30;
		switch (month) {
		case 1: case 3: case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			end=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			end=30;
			break;
		case 2:
			end=29;
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}
		System.out.println("끝의 날은 "+end+"입니다.");

	}

}
