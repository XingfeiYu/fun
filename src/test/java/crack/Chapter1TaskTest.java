package crack;

import static org.junit.Assert.*;
import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* Chapter1Task Tester. 
* 
* @author <Authors name> 
* @since <pre>Jun 15, 2016</pre> 
* @version 1.0 
*/ 
public class Chapter1TaskTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: isUniqueString(String str) 
* 
*/ 
@Test
public void testIsUniqueString() throws Exception { 
//TODO: Test goes here...
//    String first = "abcd efghijklmn%^&*)(#@";
    String first = "abcd ef";
    String second = "abcd efg higj";
    String third = "aba";
    assertTrue(Chapter1Task.isUniqueString(first));
    assertFalse(Chapter1Task.isUniqueString(second));
    assertFalse(Chapter1Task.isUniqueString(third));
}

    @Test
    public void testIsPermutation() throws Exception {
        String first = "hello world";
        String second = "dlrow olleh";
        assertTrue(Chapter1Task.isPermutation(first, second));
        second = "helo world";
        assertFalse(Chapter1Task.isPermutation(first, second));
    }

    @Test
    public void testReplaceSpace() throws Exception {
        char[] chars = "abc def kpg".toCharArray();
        char[] array = new char[100];
        System.arraycopy(chars, 0, array, 0, chars.length);
        //abc%20def%20kpg
        assertTrue(Chapter1Task.replaceSpace(array, chars.length).equals("abc%20def%20kpg"));
    }


} 
