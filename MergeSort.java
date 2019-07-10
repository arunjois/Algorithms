public class MergeSort {
  void mergesort(int a[], int i, int j) {
    int mid;
    if (i < j) {
      mid = (i + j) / 2;
      mergesort(a, i, mid);
      mergesort(a, mid + 1, j);
      merge(a, i, mid, mid + 1, j);
    }
  }

  void merge(int a[], int i1, int i2, int j1, int j2) {
    int temp[] = new int[900];
    int i, j, k;
    i = i1;
    j = j1;
    k = 0;

    while (i <= i2 && j <= j2) {
      if (a[i] < a[j])
        temp[k++] = a[i++];
      else
        temp[k++] = a[j++];
    }

    while (i <= i2)
      temp[k++] = a[i++];
    while (j <= j2)
      temp[k++] = a[j++];
    for (i = i1, j = 0; i <= j2; i++, j++)
      a[i] = temp[j];
  }

  public static void main(String args[]) {
    int a[] = { 5, 6, 7, 8, 9, 1, 2, 3, 4 };
    MergeSort m = new MergeSort();
    m.mergesort(a, 0, a.length-1);
    for(int i=0;i<9;i++) 
      System.out.println(a[i]);
  }
}
