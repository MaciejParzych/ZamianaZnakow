package Gener;

import org.junit.jupiter.api.Test;

import java.sql.PreparedStatement;

import static org.junit.jupiter.api.Assertions.*;

class PrzykladGenerykowTest {

    @Test
    void merge2SortedArraysTest() {
        int[] a = {2};
        int[] b = {4};
        PrzykladGenerykow p = new PrzykladGenerykow();
        assertArrayEquals(PrzykladGenerykow.merge2SortedArrays(a,b), new int[]{2,4});

        int[] c = {-1,111};
        assertArrayEquals(PrzykladGenerykow.merge2SortedArrays(a,c), new int[]{-1,2,111});

    }
}