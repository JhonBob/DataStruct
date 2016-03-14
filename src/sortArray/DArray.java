package sortArray;
//�鲢����O(N*LogN)
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

	// �鲢����
	public void mergeSort() {
		long[] workSpace = new long[nElems];
		recMergeSort(workSpace, 0, nElems - 1);
	}

	private void recMergeSort(long[] workSpace, int lowerBound, int upperBound) {
		if (lowerBound == upperBound)
			return;
		else {
			int mid = (lowerBound + upperBound) / 2;
			// �ݹ�ǰ��
			recMergeSort(workSpace, lowerBound, mid);
			// �ݹ���
			recMergeSort(workSpace, mid + 1, upperBound);
			// �鲢���벿�� mid+1 Ϊ������ʼֵ
			merge(workSpace, lowerBound, mid + 1, upperBound);
		}
	}

	private void merge(long[] workSpace, int lowerPtr, int highPtr,
			int upperBound) {
		// TODO Auto-generated method stub
		int j = 0;
		int lowerBound = lowerPtr;
		int mid = highPtr - 1;
		int n = upperBound - lowerBound + 1;// �鲢����

		while (lowerPtr <= mid && highPtr <= upperBound)
			if (theArray[lowerPtr] < theArray[highPtr])
				workSpace[j++] = theArray[lowerPtr++];
			else
				workSpace[j++] = theArray[highPtr++];

		// ʣ������
		while (lowerPtr <= mid)
			workSpace[j++] = theArray[lowerPtr++];

		while (highPtr <= upperBound)
			workSpace[j++] = theArray[highPtr++];

		// ���ݻ�ԭ
		for (int i = 0; i < n; i++) {
			theArray[lowerBound + i] = workSpace[i];
		}
	}

}
