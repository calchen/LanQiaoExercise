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
CPU使用：140ms
内存使用：34.24MB

 */
/*
由于这题比较奇葩，因此提供部分样例。来源：http://blog.csdn.net/chao1983210400/article/details/17419877
5 7
ABCDEFG
BABCDEF
CBABCDE
DCBABCD
EDCBABC

4 6
ABCDEF
BABCDE
CBABCD
DCBABC

1 1
A

1 2
AB

2 1
A
B

1 14
ABCDEFGHIJKLMN

13 5
ABCDE
BABCD
CBABC
DCBAB
EDCBA
FEDCB
GFEDC
HGFED
IHGFE
JIHGF
KJIHG
LKJIH
MLKJI

10 10
ABCDEFGHIJ
BABCDEFGHI
CBABCDEFGH
DCBABCDEFG
EDCBABCDEF
FEDCBABCDE
GFEDCBABCD
HGFEDCBABC
IHGFEDCBAB
JIHGFEDCBA

26 26
ABCDEFGHIJKLMNOPQRSTUVWXYZ
BABCDEFGHIJKLMNOPQRSTUVWXY
CBABCDEFGHIJKLMNOPQRSTUVWX
DCBABCDEFGHIJKLMNOPQRSTUVW
EDCBABCDEFGHIJKLMNOPQRSTUV
FEDCBABCDEFGHIJKLMNOPQRSTU
GFEDCBABCDEFGHIJKLMNOPQRST
HGFEDCBABCDEFGHIJKLMNOPQRS
IHGFEDCBABCDEFGHIJKLMNOPQR
JIHGFEDCBABCDEFGHIJKLMNOPQ
KJIHGFEDCBABCDEFGHIJKLMNOP
LKJIHGFEDCBABCDEFGHIJKLMNO
MLKJIHGFEDCBABCDEFGHIJKLMN
NMLKJIHGFEDCBABCDEFGHIJKLM
ONMLKJIHGFEDCBABCDEFGHIJKL
PONMLKJIHGFEDCBABCDEFGHIJK
QPONMLKJIHGFEDCBABCDEFGHIJ
RQPONMLKJIHGFEDCBABCDEFGHI
SRQPONMLKJIHGFEDCBABCDEFGH
TSRQPONMLKJIHGFEDCBABCDEFG
UTSRQPONMLKJIHGFEDCBABCDEF
VUTSRQPONMLKJIHGFEDCBABCDE
WVUTSRQPONMLKJIHGFEDCBABCD
XWVUTSRQPONMLKJIHGFEDCBABC
YXWVUTSRQPONMLKJIHGFEDCBAB
ZYXWVUTSRQPONMLKJIHGFEDCBA

 */
package BASIC;

import java.util.Scanner;

public class BASIC03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		// 一行一行输出
		for(int i = 0;i < n;i++) {
			// 用于列计数
			int y = 0;
			//每行分成两部分输出
			for(int j=i;j >= 0 && y < m;j--) {
				System.out.print((char)('A'+j));
				y++;
			}
			for(int j = 1; y < m;j++) {
				System.out.print((char)('A'+j));
				y++;
			}
			//换行
			System.out.println();
		}
	}
}
