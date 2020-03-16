package Use_ofBasicgrammar_IF;

import java.util.Scanner;

public class P_0315_Tokei {

	/*
	 * ����̴� ���� ��ħ �˶��� ��� �Ͼ��. �˶��� ��� �ٷ� �Ͼ�� �����̰�����, �׻� ���ݸ� �� �ڷ��� ���� ������ ���� �б���
	 * �����ϰ� �ִ�.
	 * 
	 * ����̴� ��� ����� �����غ�������, ���ݸ� �� �ڷ��� ������ �� � �͵� ���� ���� ������.
	 * 
	 * �̷� ����̸� �ҽ��ϰ� ����, â���̴� �ڽ��� ����ϴ� ����� ��õ�� �־���.
	 * 
	 * �ٷ� "45�� ���� �˶� �����ϱ�"�̴�.
	 * 
	 * �� ����� �ܼ��ϴ�. ���� �����Ǿ� �ִ� �˶��� 45�� �ռ��� �ð����� �ٲٴ� ���̴�. ������ �˶� �Ҹ��� ������, �˶��� ���� ���� ��
	 * �� ���̱� �����̴�. �� ����� ����ϸ�, ���� ��ħ �� ��ٴ� ����� ���� �� �ְ�, �б��� �������� �ʰ� �ȴ�.
	 * 
	 * ���� ����̰� ������ �˶� �ð��� �־����� ��, â������ ����� ����Ѵٸ�, �̸� ������ ���ľ� �ϴ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	public static String solution(int zikan, int bun) {

		if (bun < 45) {
			// 45���� ������
			zikan -= 1;
			// 1�ð� �ٿ��ְ�
			bun = 60 - (45 - bun);

		} else {

			bun = bun - 45;

		}

		return zikan+"�ð�"+bun +"��";
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("�ð��� �Է����ּ���:");
		int zikan = scn.nextInt();
		System.out.println("���� �Է����ּ���:");
		int bun = scn.nextInt();
	
		scn.close();
		System.out.println(solution(zikan, bun));
	}
}