package rmuti.lab06;

import java.util.Arrays;

public class ArrayListPQ {

	private ArrayList lst;

	public ArrayListPQ() {
		lst = new ArrayList();
	}

	public void enqueue(Object e) {
		lst.add(lst.size(), e);
	}

	public Object dequeue() {
		int maxIndex = maxIndex();
		Object maxObj = lst.get(maxIndex);
		lst.remove(maxIndex);
		return maxObj;
	}

	public Object peek() {
		return lst.get(maxIndex());
	}

	private int maxIndex() {
		int max = 0;
		for (int i = 0; i < lst.size(); i++) {
			Comparable d = (Comparable) lst.get(i);
			Object maxObj = lst.get(max);
			if (d.compareTo(maxObj) > 0) {
				max = i;
			}
		}
		return max;
	}

	@Override
	public String toString() {
		return Arrays.toString(lst.elementData);
	}
	
	
}