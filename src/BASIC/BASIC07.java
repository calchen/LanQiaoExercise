/*
问题描述
　　153是一个非常特殊的数，它等于它的每位数字的立方和，
	即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
	
输出格式
　　按从小到大的顺序输出满足条件的三位十进制数，每个数占一行。
	
----------
系统评分：100
CPU使用：78ms
内存使用：33.90MB

 */
package BASIC;

public class BASIC07 {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			// 获取这个三位数的百位十位个位
			int a = i % 10;
			int b = i / 10 % 10;
			int c = i / 100;
			if(a*a*a+b*b*b+c*c*c == i) {
				System.out.println(i);
			}
		}

	}
}
