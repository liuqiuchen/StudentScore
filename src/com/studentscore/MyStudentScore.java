package com.studentscore;
import java.util.Scanner; //����java.util.Scanner�࣬�����û�����ĳɼ���Ϣ
/**
 * ���ܣ�ʵ�ֽ��ա������༶���ġ�������ѧԱ���ĳɼ���Ϣ��Ȼ�����ÿ���༶ѧԱ��ƽ����
 * ֪ʶ�㣺����ѭ���������ư༶���������ڲ�ѭ������ÿ���༶��ѧԱ����
 */

public class MyStudentScore {
	public static void main(String[] args) {
		int classNum = 3;//����༶����
		int stuScore = 4;//����ÿ���༶��ѧԱ����
		int sum = 0;//ÿ���༶���ܷ�
		int avg = 0;//ÿ���༶��ƽ����
		
		//����Scanner����input
		Scanner input = new Scanner(System.in);
		
		/* ����ѭ���������ư༶���������ڲ����ÿ���༶��ѧԱ���� */
		for(int i = 1;i <= 3;i++){
			//ÿ��ѭ��ǰ���һ���ܷ�
			sum = 0;
			System.out.println("***�������" + i + "���༶ѧԱ�ĳɼ�***");
			for(int j = 1;j <= 4;j++){
				System.out.println("�������" + j + "��ѧԱ�ĳɼ�:");
				int score = input.nextInt();
				sum = sum + score;
			}
			avg = sum/4;
			System.out.println("��" + i + "�༶��ƽ����Ϊ��" + avg);
		}
	}
}
/**
 * �ܽ᣺
 * 1.ͨ����������ȷ����
 * 2.�������֪ʶ��
 * 3.����ʵ������
 * 4.�������ϵ���١��������*/
