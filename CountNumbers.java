package Iot_Java.day08;

public class CountNumbers {
	public static void main(String[] args) {
		/*
		 * �迭�� �ִ� ������ ���ڰ� �� �� �߻��ϴ��� ī��Ʈ �ϱ� 
		 * ���ѻ��� : �迭�� ũ��� 10 
		 * �Է¼����� ���� : 0 ~ 9
		 * �Է¿���
		 * 0, 1, 1, 2, 2, 5, 5, 6, 7, 7
		 * ��¿���
		 * 0�� ���� : 1
		 * 1�� ���� : 2
		 * 2�� ���� : 2
		 * 5�� ���� : 2
		 * 6�� ���� : 1
		 * 7�� ���� : 2
		 */
		int[] nums = {0, 1, 1, 2, 2, 5, 5, 6, 7, 7};
		int[] counts = new int[10];
		
		for ( int i = 0; i < nums.length; i++) {
			counts[nums[i]]++;
			// counts[nums[i]] = counts[nums[[i]]++;
		}
		for ( int j = 0; j < counts.length; j++) {
			System.out.printf("%d �� ����: %d \n", j, counts[j]);
		}
	}
}
