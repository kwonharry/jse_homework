package homework;

import java.util.Scanner;

public class InputGugudan {
/*
 * 단수를 입력받아서 구구단을 출력함
 * 예를 들어 2를 입력하면 2*1~2*9=18
 * 
 * 단, 입력값이 0 또는 음수는 불허
 * for loop
 * 
 * */
	
	public static void main(String[] args) {
		
		int num=0,i=0,result=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇 단을 하실껀가요?");
		num=scanner.nextInt();
		if(num<=0){
		System.out.println("잘못입력하셨습니다.");
		}
		
		else{
	
		for(i=1;i<10;i++){
			result=num*i;
			System.out.println(num+"*"+i+"="+result);
		}
	}
		}
}
