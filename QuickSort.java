public class QuickSort {
	public static void QuickSort(int a[],int start,int end) {
		if(start<end) {
			int pIndex = Partition(a,start,end);
			QuickSort(a,start,pIndex-1);
			QuickSort(a,pIndex+1,end);
		}
	}
	public static void swap(int a,int b){
		int temp=a;
		a=b;
		b=temp;
	}
	public static int Partition(int a[],int start,int end) {
		int pivot = a[end];
		int pIndex = start;
		for(int i=start;i<=end;i++) {
			if(a[i]<=pivot) {
				swap(a[i],a[pIndex]);
				pIndex++;
			}
		}
		swap(a[pIndex],a[end]);
		return pIndex;
	}
	public static void main(String args[]) {
		int a[]={5,6,7,8,9,1,2,3,4};
		int end=a.length-1;
		System.out.println("Array Before sorting");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
		QuickSort(a,0,end);
		System.out.println("\nArray After Sorting");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
	}
}
