package app;

import lib.Calculator;

public class GoodCalc extends Calculator{
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public double average(int[] a) {
		double sum = 0;
		for(int i=0; i<a.length; i++)
			sum += a[i];
			return sum/a.length;
	}

	public static void main(String[] args) {
		GoodCalc a = new GoodCalc();
		System.out.println(a.add(2, 3));
		System.out.println(a.sub(3, 2));
		System.out.println(a.average(new int [] {2,3,4}));

	}

}
