public class QuickSort {
	public void Quick(int a[],int start,int end) {
		if(start<end) {
			int pIndex = Partition(a,start,end);
			Quick(a,start,pIndex-1);
			Quick(a,pIndex+1,end);
		}
	}
	public void swap(int a,int b){
		int temp=a;
		a=b;
		b=temp;
	}
	public int Partition(int a[],int start,int end) {
		int pivot = a[end];
		int pIndex = start;
		for(int i=start;i<end;i++) {
			if(a[i]<pivot) {

				//swap(a[i],a[pIndex]);
				int temp=a[i+1];
				a[i+1]=a[pIndex];
				a[pIndex]=temp;
				pIndex++;
			}
		}
		//swap(a[pIndex+1],a[end]);
		int temp=a[pIndex];
		a[pIndex]=a[end];
		a[end]=temp;
		return pIndex;
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
