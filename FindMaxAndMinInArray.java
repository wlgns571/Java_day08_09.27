package Iot_Java.day08;

public class FindMaxAndMinInArray {
	public static void main(String[] args) {
		/*
		 * n개의 정수를 입력받아 배열에 저장한 후
		 * 배열에서 최대값과 최소값을 찾아 출력하기
		 * */
		// n개의 정수를 배열에 저장
		int [] nums = { 12, 34, 55, 1, 78 };
		
		// 최대값과 최소값 저장할 변수 선언 및 초기화
		int min = nums[0];
		int max = nums[0];
		// int min = Integer.MAX_VALUE;
		// int max = Integer.MIN_VALUE;
		// - min -> max value인 이유는 최소값을 찾으려면 가장 큰 값에서 내려오며 찾아야하기때문
		
		// 배열에서 최대값과 최소값을 찾기
		for ( int i = 0; i < nums.length; i++) {
			if ( max < nums[i]) {
				max = nums[i];
			}
		}
		// 배열에서 최대값과 최소값을 출력
		// if를 두번 중복해서 사용해도 괜찮음
		// else if로 묶어줘도 상관없음
		System.out.println("최대값: " + max);
		
		for ( int i = 0; i < nums.length; i++) {
			if ( min > nums[i]) {
				min = nums[i];
			}
		}	
		System.out.println("최소값: " + min);
	}
}