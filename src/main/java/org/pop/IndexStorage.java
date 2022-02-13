package org.pop;

public class IndexStorage {
    private int size;

    public IndexStorage(int size) throws IllegalArgumentException {
        checkSize(size);
        this.size = size;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        checkIndex(index);
        if (index % 2 != 0) {
            return -1 * index;
        }
        return index;
    }

    public int[] reverse() {
        int[] result = new int[size];
        int j = size - 1;
        for (int i = 0; i <= size - 1; i++) {
            result[j] = get(i);
            j--;
        }
        return result;
    }

    protected void checkIndex(int index) throws IllegalArgumentException {
        if (index > size() - 1) {
            throw new IllegalArgumentException("Введенный индекс больше, чем длина массива! index = "
                    + index + " size = " + size());
        }
    }

    protected void checkSize(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Размер не может быть меньше 0");
        }
    }
}
