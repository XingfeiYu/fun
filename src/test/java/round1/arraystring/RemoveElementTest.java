package round1.arraystring; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* RemoveElement Tester. 
* 
* @author <Authors name> 
* @since <pre>Jul 7, 2016</pre> 
* @version 1.0 
*/ 
public class RemoveElementTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: removeElement(int[] nums, int val) 
* 
*/ 
@Test
public void testRemoveElement() throws Exception { 
//TODO: Test goes here...
    int[] nums = new int[3];
    nums[0] = 3;
    nums[1] = 3;
    nums[2] = 2;
    new RemoveElement().removeElement(nums, 3);
} 


} 
