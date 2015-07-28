/**
 * 
 */
package com.aoeng.search;

import java.util.Arrays;

import edu.princeton.cs.introcs.StdOut;

/**
 * @author sczhang
 * @file BinarySearchTest.java
 * @email zhangshch0131@126.com
 * @datetime 2015年7月28日 下午4:13:54
 */
public class BinarySearchTest {
	public static int rank(int key, int[] a) { // 数组必须是有序的
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) { // 被查找的键要么不存在,要么必然存在于a[lo..hi]之中
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) hi = mid - 1;
			else if (key > a[mid]) lo = mid + 1;
			else
				return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] whitelist = { 1, 4, 5, 6, 7, 8, 9, 7, 6, 5, 34, 32, 2, 1 };
		Arrays.sort(whitelist);
		System.out.println(Arrays.toString(whitelist));
		int index = rank(8, whitelist);
		StdOut.print(index);
	}
}
