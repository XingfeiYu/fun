package basic;

import static org.junit.Assert.*;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* InsertionSort Tester. 
* 
* @author <Authors name> 
* @since <pre>May 24, 2016</pre> 
* @version 1.0 
*/ 
public class InsertionSortTest {
    private int[] test1 = null;

    private int[] test2 = new int[]{3};

    private int[] test3 = new int[]{3, 2, 5, 6, 1, 7};

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: simpleInsertionSort(int[] array) 
* 
*/ 
@Test
public void testSimpleInsertionSort() throws Exception { 
//TODO: Test goes here...
    InsertionSort.simpleInsertionSort(test1);
    assertNull(test1);

    InsertionSort.simpleInsertionSort(test2);
    assertArrayEquals(test2, new int[]{3});

    InsertionSort.simpleInsertionSort(test3);
    assertArrayEquals(test3, new int[]{1, 2, 3, 5, 6, 7});

}

    @Test
    public void testBetterSimpleInsertionSort() throws Exception {
//TODO: Test goes here...
        InsertionSort.betterSimpleInsertionSort(test1);
        assertNull(test1);

        InsertionSort.betterSimpleInsertionSort(test2);
        assertArrayEquals(test2, new int[]{3});

        InsertionSort.betterSimpleInsertionSort(test3);
        assertArrayEquals(test3, new int[]{1, 2, 3, 5, 6, 7});

    }

    @Test
    public void testRecursiveSort() throws Exception {
//TODO: Test goes here...
        InsertionSort.recursiveSort(test1);
        assertNull(test1);

        InsertionSort.recursiveSort(test2);
        assertArrayEquals(test2, new int[]{3});

        InsertionSort.recursiveSort(test3);
        assertArrayEquals(test3, new int[]{1, 2, 3, 5, 6, 7});

    }


} 
