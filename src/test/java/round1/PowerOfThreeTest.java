package round1;

import static org.junit.Assert.assertTrue;

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase;
import round1.integer.PowerOfThree;

/** 
* PowerOfThree Tester. 
* 
* @author <Authors name> 
* @since <pre>06/27/2016</pre> 
* @version 1.0 
*/ 
public class PowerOfThreeTest extends TestCase { 
public PowerOfThreeTest(String name) { 
super(name); 
} 

public void setUp() throws Exception { 
super.setUp(); 
} 

public void tearDown() throws Exception { 
super.tearDown(); 
} 

/** 
* 
* Method: isPowerOfThree(int n) 
* 
*/ 
public void testIsPowerOfThree() throws Exception { 
//TODO: Test goes here...
    assertTrue(PowerOfThree.isPowerOfThree(243));
} 



public static Test suite() { 
return new TestSuite(PowerOfThreeTest.class); 
} 
} 
