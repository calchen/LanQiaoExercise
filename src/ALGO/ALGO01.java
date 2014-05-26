/*
区间k大数查询

时间限制：1.0s   内存限制：256.0MB

问题描述
	给定一个序列，每次询问序列中第l个数到第r个数中第K大的数是哪个。
输入格式
	第一行包含一个数n，表示序列长度。
	第二行包含n个正整数，表示给定的序列。
	第三个包含一个正整数m，表示询问个数。
	接下来m行，每行三个数l,r,K，表示询问序列从左往右第l个数到第r个数中，从大往小第K大的数是哪个。序列元素从1开始标号。
输出格式
	总共输出m行，每行一个数，表示询问的答案。
样例输入
	5
	1 2 3 4 5
	2
	1 5 2
	2 3 2
样例输出
	4
	2
数据规模与约定
	对于30%的数据，n,m<=100；
	对于100%的数据，n,m<=1000；
	保证k<=(r-l+1)，序列中的数<=106。
	
----------
系统评分：100
CPU使用：250ms
内存使用：34.56MB	

 */
package ALGO;

import java.util.Arrays;
import java.util.Scanner;

public class ALGO01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}
		int m = sc.nextInt();

		int[][] p = new int[m][3];
		for (int i = 0; i < m; i++) {
			p[i][0] = sc.nextInt();
			p[i][1] = sc.nextInt();
			p[i][2] = sc.nextInt();
		}

		for (int i = 0; i < m; i++) {
			// 取出l、r、k
			int l = p[i][0], r = p[i][1], k = p[i][2];
			// 将l至r之间的数字存入数组arr
			int[] arr = new int[r - l + 1];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = list[j + l-1];
			}
			// 对数组arr排序（从小到大）
			Arrays.sort(arr);
			System.out.println(arr[arr.length - k]);

		}
	}

}
