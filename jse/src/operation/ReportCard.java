package operation;

import java.util.Scanner;

public class ReportCard {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("학생 이름 : ");
	String name= scanner.next();
	
	System.out.println("국어 점수 : ");
	int kor=scanner.nextInt();
	
	System.out.println("영어 점수 : ");
	int eng=scanner.nextInt();
	
	System.out.println("수학 점수 : ");
	int math=scanner.nextInt();
	
	System.out.println("과학 점수 : ");
	int sci=scanner.nextInt();
	
	int sum= kor+eng+math+sci;
	int ava= sum/4;
	System.out.println(name+"의 총점은" +sum+"이고, 평균은 "+ava+"입니다.");
}
}
