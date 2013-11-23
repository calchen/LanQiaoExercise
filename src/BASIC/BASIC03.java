/*
问题描述
	利用字母可以组成一些美丽的图形，下面给出了一个例子：
	ABCDEFG
	BABCDEF
	CBABCDE
	DCBABCD
	EDCBABC
	这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
	
输入格式
	输入一行，包含两个整数n和m，分别表示你要输出的图形的行数的列数。
	
输出格式
	输出n行，每个m个字符，为你的图形。
	
样例输入
	5 7
	
样例输出
	ABCDEFG
	BABCDEF
	CBABCDE
	DCBABCD
	EDCBABC

数据规模与约定
	1 <= n, m <= 26。
	
----------
系统评分：100
CPU使用：93ms
内存使用：33.90MB

 */
package BASIC;

import java.util.Scanner;

public class BASIC03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int count = 0;
		if(m != 1) {
			for (int i = 0; i < n / m + 1; i++) {
				for (int j = 0; j < m - 1 && count < n; j++,count++) {
					String str = "";
					for(int k = j;k >0;k--) {
						str += (char)('A'+k);
					}
					str += 'A';
					for(int k = 1;k < m-j;k++) {
						str += (char)('A'+k);
					}
					System.out.println(str);
				}
				for (int j = 0; j < m - 1 && count < n; j++,count++) {
					String str = "";
					for(int k = m - j - 1;k < m-1;k++) {
						str += (char)('A'+k);
					}
					str += (char)('A' + m-1);
					for(int k = m-2;k > j-1 ;k--) {
						str += (char)('A'+k);
					}
					System.out.println(str);
				}
			}
		}else {
			for(int i = 0;i < n;i++) {
				System.out.println("A");
			}
		}
	}

}
