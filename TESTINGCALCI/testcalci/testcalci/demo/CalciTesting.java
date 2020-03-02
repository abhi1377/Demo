package testcalci.demo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import calci.demo.Calculator;
import calci.demo.divideByZeroException;

public class CalciTesting {
private Calculator c;
@Before
public void makeObject()
{
c=new Calculator();
}
@After
public void delObject()
{
	c=null;
	
}
@Test 
public void testadd()
{ 
	System.out.println(c.add(3,4,5));
	Assert.assertTrue(c.add(3,4,5)==12);
}
@Test
public void testsub()
{ 
	System.out.println(c.sub(3,4,5));
	Assert.assertTrue(c.sub(3,4,5)==-6);
}
@Test
public void testmul()
{ 
	System.out.println(c.mul(3,4,5));
	Assert.assertTrue(c.mul(3,4,5)==60);
}
@Test
public void testdiv() throws divideByZeroException
{ 
	System.out.println(c.div(3,4));
	Assert.assertTrue(c.div(3,4)==0);
}
@Test(expected=divideByZeroException.class)
public void testdiv1() throws divideByZeroException
{ 
System.out.println("Cannot divide by zero");
c.div(4, 0);
}
}
