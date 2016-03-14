package sortArray;
//归并排序O(N*LogN)
public class DArray {
	private long[] theArray;
	private int nElems;

	public DArray(int max) {
		theArray = new long[max];
		nElems = 0;
	}

	public void insert(long value) {
		theArray[nElems] = value;
		nElems++;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
	}

	// 归并排序
	public void mergeSort() {
		long[] workSpace = new long[nElems];
		recMergeSort(workSpace, 0, nElems - 1);
	}

	private void recMergeSort(long[] workSpace, int lowerBound, int upperBound) {
		if (lowerBound == upperBound)
			return;
		else {
			int mid = (lowerBound + upperBound) / 2;
			// 递归前半
			recMergeSort(workSpace, lowerBound, mid);
			// 递归后半
			recMergeSort(workSpace, mid + 1, upperBound);
			// 归并两半部分 mid+1 为后半的起始值
			merge(workSpace, lowerBound, mid + 1, upperBound);
		}
	}

	private void merge(long[] workSpace, int lowerPtr, int highPtr,
			int upperBound) {
		// TODO Auto-generated method stub
		int j = 0;
		int lowerBound = lowerPtr;
		int mid = highPtr - 1;
		int n = upperBound - lowerBound + 1;// 归并数量

		while (lowerPtr <= mid && highPtr <= upperBound)
			if (theArray[lowerPtr] < theArray[highPtr])
				workSpace[j++] = theArray[lowerPtr++];
			else
				workSpace[j++] = theArray[highPtr++];

		// 剩余数据
		while (lowerPtr <= mid)
			workSpace[j++] = theArray[lowerPtr++];

		while (highPtr <= upperBound)
			workSpace[j++] = theArray[highPtr++];

		// 数据还原
		for (int i = 0; i < n; i++) {
			theArray[lowerBound + i] = workSpace[i];
		}
	}

}
