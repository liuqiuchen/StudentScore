package com.studentscore;
import java.util.Scanner; //引入java.util.Scanner类，接收用户输入的成绩信息
/**
 * 功能：实现接收【三个班级】的【各四名学员】的成绩信息，然后计算每个班级学员的平均分
 * 知识点：二重循环、外层控制班级的数量、内层循环控制每个班级的学员数量
 */

public class MyStudentScore {
	public static void main(String[] args) {
		int classNum = 3;//定义班级个数
		int stuScore = 4;//定义每个班级的学员个数
		int sum = 0;//每个班级的总分
		int avg = 0;//每个班级的平均分
		
		//创建Scanner对象input
		Scanner input = new Scanner(System.in);
		
		/* 二重循环，外层控制班级的数量，内层控制每个班级的学员数量 */
		for(int i = 1;i <= 3;i++){
			//每次循环前清空一次总分
			sum = 0;
			System.out.println("***请输入第" + i + "个班级学员的成绩***");
			for(int j = 1;j <= 4;j++){
				System.out.println("请输入第" + j + "个学员的成绩:");
				int score = input.nextInt();
				sum = sum + score;
			}
			avg = sum/4;
			System.out.println("第" + i + "班级的平均分为：" + avg);
		}
	}
}
/**
 * 总结：
 * 1.通过分析，明确需求
 * 2.整理相关知识点
 * 3.梳理实现流程
 * 4.借助“断点跟踪”解决问题*/
