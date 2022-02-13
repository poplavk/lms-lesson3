package org.pop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IndexStorageTest {
    IndexStorage indexStorage = new IndexStorage(10);

    @Test
    void get() {
        Assertions.assertEquals(0,indexStorage.get(0));
        Assertions.assertEquals(-1,indexStorage.get(1));
        Assertions.assertEquals(2,indexStorage.get(2));
    }

    @Test
    void reverse() {
        int[] reversedIndexStorage = indexStorage.reverse();
        int[] etalonArray = {-9, 8, -7, 6, -5, 4, -3, 2, -1, 0};
        Assertions.assertArrayEquals(etalonArray, reversedIndexStorage);
    }

}