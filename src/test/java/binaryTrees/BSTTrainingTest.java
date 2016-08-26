package binaryTrees; 

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* BSTTraining Tester. 
* 
* @author <Authors name> 
* @since <pre>06/23/2016</pre> 
* @version 1.0 
*/ 
public class BSTTrainingTest extends TestCase {

public BSTTrainingTest(String name) { 
super(name); 
}

   private BSTTraining bst = new BSTTraining();

public void setUp() throws Exception {
   super.setUp();
} 

public void tearDown() throws Exception { 
super.tearDown(); 
} 

/** 
* 
* Method: insert(int value) 
* 
*/ 
public void testInsert() throws Exception { 
//TODO: Test goes here...
   bst.insert(3);
   bst.insert(7);
   bst.insert(5);
   bst.insert(1);
}

/** 
* 
* Method: lookup(int value) 
* 
*/ 
public void testLookup() throws Exception { 
//TODO: Test goes here...
   bst.insert(3);
   bst.insert(7);
   bst.insert(5);
   bst.insert(1);

   assertTrue(bst.lookup(5));
   assertTrue(bst.lookup(3));
   assertTrue(bst.lookup(1));
   assertFalse(bst.lookup(6));
}

   public void testPrintPreOrder() throws Exception {
      bst.insert(7);
      bst.insert(5);
      bst.insert(8);
      bst.insert(3);
      bst.insert(6);
      bst.insert(2);
      bst.insert(4);
      bst.insert(1);
      bst.insert(9);

      bst.printPreOrder();
      System.out.println();
      bst.printInOrder();
      System.out.println();
      bst.printPostOrder();
   }


public static Test suite() { 
return new TestSuite(BSTTrainingTest.class); 
} 
} 
