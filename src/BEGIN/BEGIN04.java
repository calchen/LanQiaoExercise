/*
问题描述
	Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
	当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
输入格式
	输入包含一个整数n。
输出格式
	输出一行，包含一个整数，表示Fn除以10007的余数。
	说明：在本题中，答案是要求Fn除以10007的余数，因此我们只要能算出这个余数即可，而不需要先计算
		出Fn的准确值，再将计算的结果除以10007取余数，直接计算余数往往比先算出原数再取余简单。
样例输入
	10
样例输出
	55
样例输入
	22
样例输出
	7704
数据规模与约定
	1 <= n <= 1,000,000。
	
----------
系统评分：100
CPU使用：109ms
内存使用：34.24MB

*/
package BEGIN;

import java.util.Scanner;

public class BEGIN04 {
	public static void main(String[] args) {
		// 输入
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// i和2为特殊情况
		if (n > 2) {
			// 因为F(n)=F(n-1)+F(n-2),所以用数组村n-1个数的值
			int[] arr = new int[n + 1];
			arr[1] = 1;
			arr[2] = 1;
			int m = 10007;
			// 从n=3开始推算
			for (int i = 3; i <= n; i++) {
				arr[i] = (arr[i - 1] + arr[i - 2]) % m;
			}
			System.out.println(arr[n]);
		} else {
			System.out.println(1);
		}
	}
}
