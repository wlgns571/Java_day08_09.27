package Iot_Java.day08;

import java.util.Scanner;

public class Calleander {
	public static void main(String[] args) {
		/*
		 * ���� ��Ģ �˰���
		 * 1. ��� ������ 4�� ������ �������� �ش� �������� �Ѵ�.
		 * (2020��, 2024��, 2028��, 2032��, 2036��, 2040��, 2044�� ...)
		 * 2. ��� ������ 4, 100���� ������ �������� �ش� ������� �Ѵ�.
		 * (1800��, 1900��, 2100��, 2200��, 2300��...)
		 * 3. ��� ������ 4, 100, 400���� ������ �������� �ش� �������� �д�.
		 * (1600��, 2000��, 2400��...)
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print( "�⵵�� �Է����ּ���: " );
		int year = sc.nextInt();
		boolean isleap = false;
		//4�� ������ �������� �ش� ��������
		if(( year % 4 == 0 && year % 100 != 0) || ( year % 400 == 0)) {
			System.out.println( year + "�� �����Դϴ�.");
		} else {
			System.out.println( year + "�� ����Դϴ�.");
		}
	}
}
