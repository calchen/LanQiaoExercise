/*
问题描述
	小明为某机构设计了一个十字型的徽标（并非红十字会啊），如下所示：
	..$$$$$$$$$$$$$..
	..$...........$..
	$$$.$$$$$$$$$.$$$
	$...$.......$...$
	$.$$$.$$$$$.$$$.$
	$.$...$...$...$.$
	$.$.$$$.$.$$$.$.$
	$.$.$...$...$.$.$
	$.$.$.$$$$$.$.$.$
	$.$.$...$...$.$.$
	$.$.$$$.$.$$$.$.$
	$.$...$...$...$.$
	$.$$$.$$$$$.$$$.$
	$...$.......$...$
	$$$.$$$$$$$$$.$$$
	..$...........$..
	..$$$$$$$$$$$$$..
	对方同时也需要在电脑dos窗口中以字符的形式输出该标志，并能任意控制层数。
输入格式
	一个正整数 n (n<30) 表示要求打印图形的层数。
输出格式
	对应包围层数的该标志。
样例输入1
	1
样例输出1
	..$$$$$..
	..$...$..
	$$$.$.$$$
	$...$...$
	$.$$$$$.$
	$...$...$
	$$$.$.$$$
	..$...$..
	..$$$$$..
样例输入2
	3
样例输出2
	..$$$$$$$$$$$$$..
	..$...........$..
	$$$.$$$$$$$$$.$$$
	$...$.......$...$
	$.$$$.$$$$$.$$$.$
	$.$...$...$...$.$
	$.$.$$$.$.$$$.$.$
	$.$.$...$...$.$.$
	$.$.$.$$$$$.$.$.$
	$.$.$...$...$.$.$
	$.$.$$$.$.$$$.$.$
	$.$...$...$...$.$
	$.$$$.$$$$$.$$$.$
	$...$.......$...$
	$$$.$$$$$$$$$.$$$
	..$...........$..
	..$$$$$$$$$$$$$..
提示
	请仔细观察样例，尤其要注意句点的数量和输出位置。
	
----------
系统评分：100
CPU使用：125ms
内存使用：34.47MB

 */
package PREV;

import java.util.Arrays;
import java.util.Scanner;

public class PREV02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 思路见other中的0001.jpg
		char[][] arr = new char[n * 4 + 5][n * 4 + 5];

		for (char[] i : arr) {
			Arrays.fill(i, '.');
		}

		// 中心十字
		arr[2 * n + 2][2 * n + 0] = '$';
		arr[2 * n + 2][2 * n + 1] = '$';
		arr[2 * n + 2][2 * n + 2] = '$';
		arr[2 * n + 2][2 * n + 3] = '$';
		arr[2 * n + 2][2 * n + 4] = '$';
		arr[2 * n + 0][2 * n + 2] = '$';
		arr[2 * n + 1][2 * n + 2] = '$';
		arr[2 * n + 3][2 * n + 2] = '$';
		arr[2 * n + 4][2 * n + 2] = '$';
		// A区域
		for (int i = 0; i <= arr.length / 2 - 2; i += 2) {
			for (int j = i + 2; j <= arr.length / 2; j++) {
				arr[i][j] = '$';
			}
		}
		// B区域
		for (int i = 2; i <= arr.length / 2; i += 2) {
			arr[i - 1][i] = '$';
			arr[i][i] = '$';
			arr[i][i - 1] = '$';
		}
		// C区域
		for (int i = 0; i <= arr.length / 2 - 2; i += 2) {
			for (int j = i + 2; j <= arr.length / 2; j++) {
				arr[j][i] = '$';
			}
		}

		// 2->1,3,4
		for (int i = 0; i <= arr.length / 2; i++) {
			for (int j = 0; j <= arr.length /2; j++) {
				arr[i][arr.length - j - 1] = arr[i][j];
				arr[arr.length - i - 1][j] = arr[i][j];
				arr[arr.length - i - 1][arr.length - j - 1] = arr[i][j];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "");
			}
			System.out.println();
		}

	}

}
