package Iot_Java.day08;

public class CountNumbers {
	public static void main(String[] args) {
		/*
		 * 배열에 있는 각각의 숫자가 몇 번 발생하는지 카운트 하기 
		 * 제한사항 : 배열의 크기는 10 
		 * 입력숫자의 범위 : 0 ~ 9
		 * 입력예시
		 * 0, 1, 1, 2, 2, 5, 5, 6, 7, 7
		 * 출력예시
		 * 0의 개수 : 1
		 * 1의 개수 : 2
		 * 2의 개수 : 2
		 * 5의 개수 : 2
		 * 6의 개수 : 1
		 * 7의 개수 : 2
		 */
		int[] nums = {0, 1, 1, 2, 2, 5, 5, 6, 7, 7};
		int[] counts = new int[10];
		
		for ( int i = 0; i < nums.length; i++) {
			counts[nums[i]]++;
			// counts[nums[i]] = counts[nums[[i]]++;
		}
		for ( int j = 0; j < counts.length; j++) {
			System.out.printf("%d 의 개수: %d \n", j, counts[j]);
		}
	}
}
