/*
问题描述
　　给定n个十六进制正整数，输出它们对应的八进制数。

输入格式
　　输入的第一行为一个正整数n （1<=n<=10）。
　　接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转
换的十六进制正整数，每个十六进制数长度不超过100000。

输出格式
　　输出n行，每行为输入对应的八进制正整数。

注意
　　输入的十六进制数不会有前导0，比如012A。
　　输出的八进制数也不能有前导0。

样例输入
	2
	39
	123ABC

样例输出
	71
	4435274
	
提示
　　先将十六进制数转换成某进制数，再由某进制数转换成八进制。
	
----------
系统评分：100
CPU使用：453ms
内存使用：34.55MB

 */
package BASIC;

import java.util.ArrayList;
import java.util.Scanner;

public class BASIC12 {
	//十六进制对应的二进制字符串
	private static String[] HexToBinary = { "0000", "0001", "0010", "0011",
			"0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011",
			"1100", "1101", "1110", "1111" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 输入n
		int n = Integer.parseInt(sc.nextLine());
		// 创建ArrayList用于存放每一个十六进制字符串。将其容量设置为n，避免空间增长的时间消耗
		ArrayList<char[]> list = new ArrayList<>(n);
		// 将每个字符串的字母转换为大写后，将字符串转换成char数组并添加到ArrayList中
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine().toUpperCase();
			char[] c = str.toCharArray();
			list.add(c);
		}

		// 遍历整个ArrayList
		for (char[] i : list) {
			// 十六进制转八进制，先将十六进制转换为二进制，在将二进制转换为八进制

			// result数组用于存储八进制结果，结果的低位从0开始
			int[] result = new int[i.length * 4 / 3 + 1];
			// 表示result数组的下表
			int index = 0;
			// 临时字符串
			String temp = "";
			//从每个十六进制数字的最低位，即十六进制数字字符数组的最高位，开始转换。一个十六进制数转成4位二进制数，3位二进制数转成一个八进制
			for (int j = i.length - 1; j >= 0; j--) {
				// 将十六进制数转换为二进制字符串
				String binstr = HexToBinary(i[j]);

				temp = binstr + temp;
				// 每三个二进制转换成一个八进制
				while (temp.length() >= 3) {
					char[] c = temp.toCharArray();

					int k = c.length - 1;
					result[index++] = (c[k - 2] - '0') * 4 + (c[k - 1] - '0')
							* 2 + (c[k] - '0');
					// 将传转换过的二进制数字去除
					temp = temp.substring(0, temp.length() - 3);
				}
			}

			// 处理剩余的小于三位的二进制数
			if (temp.length() > 0) {
				result[index] = Integer.parseInt(temp, 2);
			}

			// 去除八进制结果的前导0
			while (result[index] == 0) {
				index--;
			}
			// 输出结果
			for (int j = index; j >= 0; j--) {
				System.out.print(result[j]);
			}
			System.out.println();

		}
	}

	//根据字符c返回对应的二进制数字符串
	private static String HexToBinary(char c) {
		if (c >= '0' && c <= '9') {
			return HexToBinary[c - '0'];
		} else if (c >= 'A' && c <= 'Z') {
			return HexToBinary[c - 'A' + 10];
		}
		return null;
	}
}
