package Iot_Java.day08;

public class FindMaxAndMinInArray {
	public static void main(String[] args) {
		/*
		 * n���� ������ �Է¹޾� �迭�� ������ ��
		 * �迭���� �ִ밪�� �ּҰ��� ã�� ����ϱ�
		 * */
		// n���� ������ �迭�� ����
		int [] nums = { 12, 34, 55, 1, 78 };
		
		// �ִ밪�� �ּҰ� ������ ���� ���� �� �ʱ�ȭ
		int min = nums[0];
		int max = nums[0];
		// int min = Integer.MAX_VALUE;
		// int max = Integer.MIN_VALUE;
		// - min -> max value�� ������ �ּҰ��� ã������ ���� ū ������ �������� ã�ƾ��ϱ⶧��
		
		// �迭���� �ִ밪�� �ּҰ��� ã��
		for ( int i = 0; i < nums.length; i++) {
			if ( max < nums[i]) {
				max = nums[i];
			}
		}
		// �迭���� �ִ밪�� �ּҰ��� ���
		// if�� �ι� �ߺ��ؼ� ����ص� ������
		// else if�� �����൵ �������
		System.out.println("�ִ밪: " + max);
		
		for ( int i = 0; i < nums.length; i++) {
			if ( min > nums[i]) {
				min = nums[i];
			}
		}	
		System.out.println("�ּҰ�: " + min);
	}
}