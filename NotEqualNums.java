package Iot_Java.day08;

import java.util.Scanner;

public class NotEqualNums {
	public static void main(String[] args) {
		/*
		 * 5���� ���ڸ� �Է�(Ű�����Է�) �޾� ����ϱ�
		 * ��, �ߺ��� (�̹� �Էµ�) ���ڸ� �Է��� �� ����
		 * */
		// 1. 5���� ����
			int [] nums = new int[5];
		// 2. Ű���� �Է���ġ �غ�
			Scanner sc = new Scanner(System.in);
		// 3. �ݺ����� ���� 5���� ���� �Է¹ޱ�
			for ( int i = 0; i < nums.length; i++) {
				System.out.print( (i + 1) +"��°: ");
				nums[i] = sc.nextInt();
		// 4. ��, �ߺ��� (�̹� �Էµ�) ���ڸ� �Է��� �� ����
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
