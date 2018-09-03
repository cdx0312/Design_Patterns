package test.com.dp.iterator; 

import com.dp.iterator.*;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* ArrayList Tester. 
* 
* @author <Authors name> 
* @since <pre>Ê®ÔÂ 27, 2017</pre> 
* @version 1.0 
*/ 
public class ArrayListTest { 

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
    Collection collection = new ArrayList();
    for (int i = 0; i < 32; i++) {
        collection.add(new Cat(i));
    }
    System.out.println(collection.size());
    Iterator iterator = collection.iterator();
    while (iterator.hasNext()){
        System.out.println(iterator.next());
    }
} 

/** 
* 
* Method: size() 
* 
*/ 
@Test
public void testSize() throws Exception { 
//TODO: Test goes here... 
} 


} 
