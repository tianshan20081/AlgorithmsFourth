/**
 * 
 */
package com.aoeng.day01;

/**
 * @author sczhang
 * @file GreatestCommonDivisor.java
 * @email zhangshch0131@126.com
 * @datetime 2015年7月28日 上午12:22:31
 * 计算两个非负整数的最大公约数
 */
public class GreatestCommonDivisor {
	public static void main(String[] args) {
		int n = 6;
		int m = 9;
		int max = gcd(m, n);
		System.out.println(max);
		int min = lcm(m, n);
		System.out.println(min);
	}

	/**
	 * 计算两个数的最小公倍数
	 * @param m
	 * @param n
	 * @return
	 */
	private static int lcm(int m, int n) {
		return m * n / gcd(n, m);
	}

	/**
	 * 计算两个数的最大公约数
	 * @param n
	 * @param m
	 * @return
	 */
	private static int gcd(int n, int m) {
		if (Math.min(n, m) == 0) {
			return Math.max(n, m);
		}
		int r = n % m;
		//		System.out.println(r);
		return gcd(m, r);
	}
}
