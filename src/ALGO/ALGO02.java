/*
最大最小公倍数

时间限制：1.0s   内存限制：256.0MB

问题描述
	已知一个正整数N，问从1~N-1中任选出三个数，他们的最小公倍数最大可以为多少。
输入格式
	输入一个正整数N。
输出格式
	输出一个整数，表示你找到的最小公倍数。
样例输入
	9
样例输出
	504
数据规模与约定
	1 <= N <= 1000000。;
	
----------
系统评分：100
CPU使用：250ms
内存使用：34.56MB	

 */
package ALGO;

import java.util.ArrayList;
import java.util.Scanner;

public class ALGO02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long begin = System.currentTimeMillis();
		
		int[] sushu = new int[n + 1];
		for (int i = 0; i < sushu.length; i++) {
			sushu[i] = i;
		}
		sushu[1] = 0;
		for (int i = 2; i < sushu.length; i++) {
			for (int j = 2; i * j < sushu.length; j++) {
				sushu[i * j] = 0;
			}
		}

		ArrayList<Integer> list = new ArrayList<Integer>(10000);
		for (int i = 0; i < sushu.length; i++) {
			if (sushu[i] != 0) {
				list.add(sushu[i]);
			}
		}

		int[][] fenjie = new int[n + 1][19];
		sushu[0] = 1;
		sushu[1] = 1;
		for (int i = 1; i < sushu.length; i++) {
			//fenjie[i][0] = i;
			int temp = i;
			int index = 0;
			while (sushu[temp] == 0) {
				for (int j : list) {
					if (temp % j == 0) {
						temp = temp / j;
						fenjie[i][index++] = j;
						break;
					}
				}
			}
			fenjie[i][index] = temp;
		}

		long end = System.currentTimeMillis();

		System.out.println(end - begin);
	}

}
