package homework;

import java.util.Scanner;

public class InputSum {
//두개의 정수를 입력받아서 그 범위내의 정수의 합 구하기 단, 마이너스는 없음
	public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	
	System.out.println("두 수를 입력하시오.");
	int num1=scanner.nextInt();
	int num2=scanner.nextInt();
	
	int big=0,small=0,sum=0,i=0;
	big= (num1>=num2)? num1:num2;
	small=(num1<num2)? num1:num2;
	
	/*if(num1>num2){
		big=num1;
		small=num2;
	}else {
		big=num2;
		small=num1;
	}
	*/
	for(i=small;i<=big;i++){
		sum+=i;
	}
	
	System.out.println(small+"부터 "+big+"까지의 합은 "+sum+"입니다.");
	}
	
}

