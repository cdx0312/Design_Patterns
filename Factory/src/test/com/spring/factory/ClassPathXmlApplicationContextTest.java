package test.com.spring.factory; 

import com.spring.factory.BeanFactory;
import com.spring.factory.ClassPathXmlApplicationContext;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* ClassPathXmlApplicationContext Tester. 
* 
* @author <Authors name> 
* @since <pre>Ê®Ò»ÔÂ 1, 2017</pre> 
* @version 1.0 
*/ 
public class ClassPathXmlApplicationContextTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getBean(String id) 
* 
*/ 
@Test
public void testGetBean() throws Exception {
    BeanFactory factory = new ClassPathXmlApplicationContext("com/spring/factory/applicationContext.xml");
} 


} 
