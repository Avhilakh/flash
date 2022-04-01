
public class Practice {
	public void sort(int[] arr) {
		int len = arr.length;
		for(int i=1;i<len;i++) {
			int minind = i;
			for(int j=i-1;j>=0;j--) {
				if(arr[minind]<=arr[j]) {
					int temp = arr[minind];
					arr[minind] = arr[j];
					arr[j] = temp;
					minind = minind-1;
				}
			}
			
		}
	}
	public static void main(String[] args) {
		int[] arr1 = {1,9,14};
		int[] arr2 = {2,4,10,17,19};
		int n1 = arr1.length;
		int n2 = arr2.length;
		int n3 = n1+n2;
		int[] arr3 = new int[n3];
		for(int i=0;i<n1;i++) {
			arr3[i] = arr1[i];
		}
		int j=0;
		for(int i=n1;i<n3;i++) {
			arr3[i] = arr2[j];
			j=j+1;
		}
		Practice obj = new Practice();
		obj.sort(arr3);
		for(int i=0;i<n3;i++) {
			System.out.println(arr3[i]);
			
		}
		
		
	}
}
