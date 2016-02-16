package homework;

import java.util.Scanner;

public class MonthEndDay2 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("년도와 월을 입력하세요.");
		int year=scanner.nextInt();
		int month=scanner.nextInt();
		

		int end=30;
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: end=31;break;
		
		case 4: case 6: case 9: case 11: end=30; break;
		
		case 2: 
			if(year%4==0){
				end=29;
			}
			else end=28;
			break;
		
		default: System.out.println("잘못입력하셨습니다."); break;
		}
		
		System.out.println(year+"년도"+month+"월의 마지막 날은 "+end+"입니다.");

	}
		
	
}
