/*
问题描述
	杨辉三角形又称Pascal三角形，它的第i+1行是(a+b)i的展开式的系数。
	　　
	它的一个重要性质是：三角形中的每个数字等于它两肩上的数字相加。
	　　
	下面给出了杨辉三角形的前4行：
	　　
	   1
	　　
	  1 1
	　　
	 1 2 1
	　　
	1 3 3 1
	　　
	给出n，输出它的前n行。

输入格式
	输入包含一个数n。

输出格式
	输出杨辉三角形的前n行。每一行从这一行的第一个数开始依次输出，中间使用一个空格分隔。请不要在前面输出多余的空格。

样例输入
	4

样例输出
	1
	1 1
	1 2 1
	1 3 3 1

数据规模与约定
	1 <= n <= 34。
	
----------
系统评分：100
CPU使用：140ms
内存使用：34.43MB

 */
package BASIC;

import java.util.Scanner;

public class BASIC06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 利用这个数组存储上一行的数据从而计算出这行的数据
		int[] arr = new int[n];
		arr[0] = 1;
		// n大于等于1，因此 1 肯定会输出
		System.out.println("1");
		for (int i = 1; i < n; i++) {
			arr[i] = 1;
			// 每行开头都是1
			System.out.print("1 ");
			int exValue = 1;
			for (int j = 1; j < i; j++) {
				int curentValue = arr[j] + arr[j - 1];
				arr[j - 1] = exValue;
				exValue = curentValue;
				System.out.print(curentValue + " ");
			}
			arr[i - 1] = exValue;
			// 每行结尾都是1
			System.out.println("1");
		}

	}
}
