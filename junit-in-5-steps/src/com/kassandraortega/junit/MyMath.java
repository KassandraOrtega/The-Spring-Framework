package com.kassandraortega.junit;

public class MyMath {
	int sunm(int[] numbers) {
		int sum = 0;
		for(int i : numbers) {
			sum += i;
		}
		return sum;
	}
}
