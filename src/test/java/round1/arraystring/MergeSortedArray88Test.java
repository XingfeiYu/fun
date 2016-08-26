package round1.arraystring; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* MergeSortedArray88 Tester. 
* 
* @author <Authors name> 
* @since <pre>Jul 8, 2016</pre> 
* @version 1.0 
*/ 
public class MergeSortedArray88Test { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: merge(int[] nums1, int m, int[] nums2, int n) 
* 
*/ 
@Test
public void testMerge() throws Exception { 
//TODO: Test goes here...
    int[] num1 = new int[3];
    int[] num2 = new int[1];
    num2[0] = 1;
    new MergeSortedArray88().merge(num1, 0, num2, 1);
}


} 
