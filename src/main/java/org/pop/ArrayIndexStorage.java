package org.pop;

public class ArrayIndexStorage extends IndexStorage {
    private int[] array;

    public ArrayIndexStorage(int[] array) {
        super(array.length);
        this.array = array;
    }

    @Override
    public int get(int index) {
        checkIndex(index);
        return array[index];
    }

    public int[] getArray() {
        return array;
    }
}
