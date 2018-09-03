package test.com.dp.iterator; 

import com.dp.iterator.Cat;
import com.dp.iterator.LinkedList;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* LinkedList Tester. 
* 
* @author <Authors name> 
* @since <pre>Ê®ÔÂ 27, 2017</pre> 
* @version 1.0 
*/ 
public class LinkedListTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add(Object object) 
* 
*/ 
@Test
public void testAdd() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: size() 
* 
*/ 
@Test
public void testSize() throws Exception {
    LinkedList linkedList = new LinkedList();
    for (int i = 0; i < 15; i++) {
        linkedList.add(new Cat(i));
    }
    System.out.println(linkedList.size());
} 


} 
