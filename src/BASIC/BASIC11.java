/*
问题描述
　　从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
　　注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。

样例输入
	FFFF

样例输出
	65535
	
----------
系统评分：100
CPU使用：125ms
内存使用：34.23MB

 */
package BASIC;

import java.util.Scanner;

public class BASIC11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toUpperCase();
		
		char[] c = str.toCharArray();
		long result = 0, n = 1;
		for (int i = c.length - 1; i >= 0; i--) {
			if(c[i]>='A') {
				c[i] = (char) (c[i]-'A' + '9'+1);
			}
			int a = c[i]-'0';
			result += a * n;
			n *= 16;
		}
		System.out.println(result);
	}
}
