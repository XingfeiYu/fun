package round1;

import static org.junit.Assert.*;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import round1.arraystring.ContainDuplicate;

/** 
* ContainDuplicate Tester. 
* 
* @author <Authors name> 
* @since <pre>Jun 22, 2016</pre> 
* @version 1.0 
*/ 
public class ContainDuplicateTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: containsDuplicate(int[] nums) 
* 
*/ 
@Test
public void testContainsDuplicate() throws Exception {
    int[] array = new int[]{3, 1};
    assertFalse(ContainDuplicate.containsDuplicate(array));
//TODO: Test goes here... 
} 


} 
