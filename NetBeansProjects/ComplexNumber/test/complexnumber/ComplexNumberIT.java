package complexnumber;

import junit.framework.TestCase;

public class ComplexNumberIT extends TestCase {

private ComplexNumber cOneZero;

private ComplexNumber cZeroOne;

private ComplexNumber cOneOne;



public ComplexNumberIT(String testName) {

super(testName);

}

@Override

protected void setUp() throws Exception {

cOneZero = new ComplexNumber(1, 0);

cZeroOne = new ComplexNumber(0, 1);

cOneOne = new ComplexNumber(1, 1);

}

@Override

protected void tearDown() throws Exception {

cOneZero = null;

cZeroOne = null;

cOneOne = null;

}

/**

* Test of getReal method, of class ComplexNumber.

*/

public void testGetReal() {

System.out.println("getReal");

double expResult = 0.0;

double result = cZeroOne.getReal();

assertEquals(expResult, result);

}

/**

* Test of getImaginary method, of class ComplexNumber.

*/

public void testGetImaginary() {

System.out.println("getImaginary");

double expResult = 0.0;

double result = cOneZero.getImaginary();

assertEquals(expResult, result);

}

/**

* Test of add method, of class ComplexNumber.

*/

public void testAdd() {

System.out.println("multiply");

ComplexNumber result = cZeroOne.add(cOneZero);

assertEquals(cOneOne, result);

}

/**

* Test of multiply method, of class ComplexNumber.

*/

public void testMultiply() {

System.out.println("multiply");

ComplexNumber result = cZeroOne.multiply(cOneZero);

assertEquals(cZeroOne, result);

}

/**

* Test of equals method, of class ComplexNumber.

*/

public void testEquals() {

System.out.println("equals");

boolean expResult = false;

boolean result = cZeroOne.equals(cOneZero);

assertEquals(expResult, result);

}

}