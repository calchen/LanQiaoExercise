/*
问题描述
对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
	00000
	00001
	00010
	00011
	00100
请按从小到大的顺序输出这32种01串。

输入格式
	本试题没有输入。

输出格式
	输出32行，按从小到大的顺序每行一个长度为5的01串。
	
样例输出
	00000
	00001
	00010
	00011
	<以下部分省略>
	
----------
系统评分：100
CPU使用：93ms
内存使用：33.90MB

 */
package BASIC;

public class BASIC02 {
	public static void main(String[] args) {
		// 5位二进制即十进制从0到31
		for (byte i = 0; i < 32; i++) {
			String str = Integer.toBinaryString(i);
			// 不足5位补0
			str = "00000".substring(0, 5 - str.length()) + str;
			System.out.println(str);
		}
	}

}
