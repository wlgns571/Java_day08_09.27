package Iot_Java.day08;

import java.util.Scanner;

public class Calleander {
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
		System.out.print( "년도를 입력해주세요: " );
		int year = sc.nextInt();
		boolean isleap = false;
		//4로 나누어 떨어지는 해는 윤년으로
		if(( year % 4 == 0 && year % 100 != 0) || ( year % 400 == 0)) {
			System.out.println( year + "는 윤년입니다.");
		} else {
			System.out.println( year + "는 평년입니다.");
		}
	}
}
