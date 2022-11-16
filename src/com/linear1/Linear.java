package com.linear1;

public class Linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5,6,7,8};
int key=2;
linear(a,key);
	}

	private static void linear(int[] a, int key) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				System.out.println("found at "+i);
			}
		}
	}

}
