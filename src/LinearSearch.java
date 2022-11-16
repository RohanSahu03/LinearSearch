
public class LinearSearch {

	public static int linearSearch(int arr[],int key) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		
		
		return -1;
		
	}
	public static void main(String args[]) {
		int arr[]= {12,23,34,45,56,67};
		int key=80;
		int res=linearSearch(arr, key);
		if(res==-1) {
			System.out.println("not found");
		}else {
			System.out.println("found at index "+res);
		}
	}
	
}
