package round1;

import static org.junit.Assert.*;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import round1.arraystring.ExcelSheet;

/** 
* ExcelSheet Tester. 
* 
* @author <Authors name> 
* @since <pre>Jun 22, 2016</pre> 
* @version 1.0 
*/ 
public class ExcelSheetTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: titleToNumber(String s) 
* 
*/ 
@Test
public void testTitleToNumber() throws Exception {
    assertEquals(ExcelSheet.titleToNumber("AAA"), 703);
    assertEquals(ExcelSheet.titleToNumber("BA"), 53);
//TODO: Test goes here...
} 


} 
