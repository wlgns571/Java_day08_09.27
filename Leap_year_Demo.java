package Iot_Java.day08;

import java.util.Scanner;

public class Leap_year_Demo {
	public static void main(String[] args) {
		/*
		 * 윤년 규칙 알고리즘
		 * 1. 기원 연수가 4로 나누어 떨어지는 해는 윤년으로 한다.
		 * (2020년, 2024년, 2028년, 2032년, 2036년, 2040년, 2044년 ...)
		 * 2. 기원 연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다.
		 * (1800년, 1900년, 2100년, 2200년, 2300년...)
		 * 3. 기원 연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다.
		 * (1600년, 2000년, 2400년...)
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력해주세요: ");
		int i = sc.nextInt();
			
			// 1. 만약, 입력값이 4로 나누었을때 나머지가 0일경우
			if(i % 4 == 0){
				// 2. 1번의 값에 해당하는 경우: i값에 400을 나누었을 경우 나머지가 0이 아니고, 
				//    100을 나누었을 경우 나머지가 0으로 출력되는 경우를 설정
				if(i % 400 != 0 && i % 100 == 0)
					System.out.println( i + "년은 평년입니다." );
				// 3. 2번의 값에 해당하지 않을 경우 출력되는 값
				else
					System.out.println( i + "년은 윤년입니다." );
			}
				// 4. 1번의 값에 해당하지 않을 경우 출력되는 값
				else{
					System.out.println( i + "년은 평년입니다." );
			}	
				
	}
}