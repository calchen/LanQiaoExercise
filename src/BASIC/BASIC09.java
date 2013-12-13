/*
问题描述
　　123321是一个非常特殊的数，它从左边读和从右边读是一样的。
　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。

输入格式
　　输入一行，包含一个正整数n。

输出格式
　　按从小到大的顺序输出满足条件的整数，每个整数占一行。

样例输入
	52
样例输出
	899998
	989989
	998899

数据规模和约定
　　1<=n<=54。
	
----------
系统评分：100
CPU使用：140ms
内存使用：34.27MB

 */
package BASIC;

import java.util.Scanner;

public class BASIC09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int a = 1; a <= 9; a++) {
			for (int b = 0; b <= 9; b++) {
				for (int c = 0; c <= 9; c++) {
					if (n == a * 2 + b * 2 + c) {
						System.out.println("" + a + b + c + b + a);
					}
				}
			}
		}
		for (int a = 1; a <= 9; a++) {
			for (int b = 0; b <= 9; b++) {
				for (int c = 0; c <= 9; c++) {
					if (n == a * 2 + b * 2 + c * 2) {
						System.out.println("" + a + b + c + c + b + a);
					}
				}
			}
		}
	}
}
