/*
问题描述
	小张是软件项目经理，他带领3个开发组。工期紧，今天都在加班呢。为鼓舞士气，小张打算给每个组发一袋核桃（据传言能补脑）。他的要求是：
	1. 各组的核桃数量必须相同
	2. 各组内必须能平分核桃（当然是不能打碎的）
	3. 尽量提供满足1,2条件的最小数量（节约闹革命嘛）
输入格式
	输入包含三个正整数a, b, c，表示每个组正在加班的人数，用空格分开（a,b,c<30）
输出格式
	输出一个正整数，表示每袋核桃的数量。
样例输入1
	2 4 5
样例输出1
	20
样例输入2
	3 1 1
样例输出2
	3
	
----------
系统评分：100
CPU使用：109ms
内存使用：34.24MB

 */
package PREV;

import java.util.Scanner;

public class PREV01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(threelcm(a, b, c));
	}

	// 两个数的最大公约数
	public static int gcd(int a, int b) {
		if (a < b) {
			a += b;
			b = a - b;
			a = a - b;
		}
		
		while(a%b!=0) {
			int temp =a % b;
			a = b;
			b = temp;
		}
		return b;
	}
	
	// 两个数的最小公倍数
	public static int lcm(int a,int b) {
		int gcd = gcd(a, b);
		if(gcd == 0) {
			return 0;
		}else {
			return a*b/gcd;
		}
		
	}
	
	//三个数的最小公倍数
	public static int threelcm(int a,int b,int c) {
		return lcm(lcm(a,b),c);
	}

}
