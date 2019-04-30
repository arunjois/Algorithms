public class QuickSort {
	public void Quick(int a[],int start,int end) {
		if(start<end) {
			int pIndex = Partition(a,start,end);
			Quick(a,start,pIndex-1);
			Quick(a,pIndex+1,end);
		}
	}
	public int Partition(int a[],int start,int end) {
		int pivot = a[end];
		int pIndex = start-1;
		for(int i=start;i<end;i++) {
			if(a[i]<=pivot) {
				pIndex++;
				int temp=a[i];
				a[i]=a[pIndex];
				a[pIndex]=temp;
			}
		}
		int temp=a[pIndex+1];
		a[pIndex+1]=a[end];
		a[end]=temp;
		return pIndex+1;
	}
	public static void main(String args[]) {
		QuickSort q = new QuickSort();
		int a[]={5,4,8,7,3,6,1};
		int end=a.length-1;
		System.out.println("Array Before sorting");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
		System.out.println("\n"+end);
		q.Quick(a,0,end);
		System.out.println("\nArray After Sorting");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
	}
}
