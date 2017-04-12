package rmuti.lab06;

import java.util.Arrays;

public class ArrayList {

	protected Object[] elementData = new Object[3];
	private int size = 0;

	// Method Remove Even
	public void remove(int i) {
		for (int j = i; j < size - 1; j++) {
			elementData[j] = elementData[j + 1];
		}
		elementData[size - 1] = null;
		size--;
	}
	
	public int size(){
		return size;
	}
	
	public Object get(int i){
		return elementData[i];
	}

	// Method add
	public void add(int index, Object a) {
		ensureCapacity(size + 1);
		if (index == 0) {
			for (int i = size - 1; i >= index; i--) {
				elementData[i + 1] = elementData[i];
			}
		}
		elementData[index] = a;
		size++;
	}

	// Method ensureCapacity
	public void ensureCapacity(int capacity) {
		if (capacity > elementData.length) {
			int s = 2 * elementData.length;
			Object[] arr = new Object[s];
			for (int i = 0; i < size - 1; i++) {
				arr[i] = elementData[i];
			}
			elementData = arr;
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(elementData);
	}

}