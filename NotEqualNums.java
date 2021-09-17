package Iot_Java.day08;

import java.util.Scanner;

public class NotEqualNums {
	public static void main(String[] args) {
		/*
		 * 5개의 숫자를 입력(키보드입력) 받아 출력하기
		 * 단, 중복된 (이미 입력된) 숫자를 입력할 수 없음
		 * */
		// 1. 5개의 숫자
			int [] nums = new int[5];
		// 2. 키보드 입력장치 준비
			Scanner sc = new Scanner(System.in);
		// 3. 반복문을 통해 5개의 숫자 입력받기
			for ( int i = 0; i < nums.length; i++) {
				System.out.print( (i + 1) +"번째: ");
				nums[i] = sc.nextInt();
		// 4. 단, 중복된 (이미 입력된) 숫자를 입력할 수 없음
				for ( int j = 0; j < i; j++ ) {
					if ( nums[i] == nums[j]) {
						i--;
					}
				}
				System.out.println();
			}
			
			for ( int i = 0; i < nums.length; i++) {
				System.out.print(nums[i] + "\t");
			}
	}
}
