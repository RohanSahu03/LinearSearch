package com.linear;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {12,98,345,23,75,213,64};
		int key=213;
		
		int res = linear(ar,key);
		if(res==-1) {
			System.out.println("not found");
		}else {
			System.out.println("found at "+ res);
		}
		
	}

	private static int linear(int[] ar, int key) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<ar.length;i++) {
			if (ar[i]==key) {
				return i;
			}
				
		}
		
		
		
		return -1;
	}

}
