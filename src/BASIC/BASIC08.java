/*
问题描述
　　1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
输出格式
　　按从小到大的顺序输出满足条件的四位十进制数。
	
----------
系统评分：100
CPU使用：93ms
内存使用：33.90MB

 */
package BASIC;

public class BASIC08 {
	public static void main(String[] args) {
		for (int i = 1000; i < 10000; i++) {
			// 获取这个四位数的千位百位十位个位
			int a = i % 10;
			int b = i / 10 % 10;
			int c = i / 100 % 10;
			int d = i / 1000;
			// 正反构成字符串进行比较
			String m = ""+a+b+c+d;
			String n = ""+d+c+b+a;
			
			if(m.equals(n)) {
				System.out.println(i);
			}
		}
	}

}
