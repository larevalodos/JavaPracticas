/**
 * CalculatorTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CalculatorTestCase extends junit.framework.TestCase {
	
	private static int Val1  =0;
	private static int Val2  =0;
	
    public CalculatorTestCase(java.lang.String name) {
        super(name);
    }

    public void testCalculatorSoap12WSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new org.tempuri.CalculatorLocator().getCalculatorSoap12Address() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new org.tempuri.CalculatorLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1CalculatorSoap12Add() throws Exception {
        org.tempuri.CalculatorSoap12Stub binding;
        try {
            binding = (org.tempuri.CalculatorSoap12Stub)
                          new org.tempuri.CalculatorLocator().getCalculatorSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        int value = -3;
        value = binding.add(Val1,Val2);
        // TBD - validate results
    }

    public void test2CalculatorSoap12Subtract() throws Exception {
        org.tempuri.CalculatorSoap12Stub binding;
        try {
            binding = (org.tempuri.CalculatorSoap12Stub)
                          new org.tempuri.CalculatorLocator().getCalculatorSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        int value = -3;
        value = binding.subtract(Val1,Val2);
        // TBD - validate results
        System.out.println(value);
    }

    public void test3CalculatorSoap12Multiply() throws Exception {
        org.tempuri.CalculatorSoap12Stub binding;
        try {
            binding = (org.tempuri.CalculatorSoap12Stub)
                          new org.tempuri.CalculatorLocator().getCalculatorSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        int value = -3;
        value = binding.multiply(Val1,Val2);
        // TBD - validate results
        System.out.println(value);
    }

    public void test4CalculatorSoap12Divide() throws Exception {
        org.tempuri.CalculatorSoap12Stub binding;
        try {
            binding = (org.tempuri.CalculatorSoap12Stub)
                          new org.tempuri.CalculatorLocator().getCalculatorSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        int value = -3;
        value = binding.divide(Val1,Val2);
        // TBD - validate results
        System.out.println(value);
    }

    public void testCalculatorSoapWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new org.tempuri.CalculatorLocator().getCalculatorSoapAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new org.tempuri.CalculatorLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test5CalculatorSoapAdd() throws Exception {
        org.tempuri.CalculatorSoapStub binding;
        try {
            binding = (org.tempuri.CalculatorSoapStub)
                          new org.tempuri.CalculatorLocator().getCalculatorSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        int value = -3;
        value = binding.add(Val1,Val2);
        // TBD - validate results
        System.out.println(value);
    }

    public void test6CalculatorSoapSubtract() throws Exception {
        org.tempuri.CalculatorSoapStub binding;
        try {
            binding = (org.tempuri.CalculatorSoapStub)
                          new org.tempuri.CalculatorLocator().getCalculatorSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        int value = -3;
        value = binding.subtract(Val1,Val2);
        // TBD - validate results
        System.out.println(value);
    }

    public void test7CalculatorSoapMultiply() throws Exception {
        org.tempuri.CalculatorSoapStub binding;
        try {
            binding = (org.tempuri.CalculatorSoapStub)
                          new org.tempuri.CalculatorLocator().getCalculatorSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        int value = -3;
        value = binding.multiply(Val1,Val2);
        // TBD - validate results
        System.out.println(value);
    }

    public void test8CalculatorSoapDivide() throws Exception {
        org.tempuri.CalculatorSoapStub binding;
        try {
            binding = (org.tempuri.CalculatorSoapStub)
                          new org.tempuri.CalculatorLocator().getCalculatorSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        int value = -3;
        value = binding.divide(Val1,Val2);
        // TBD - validate results
        System.out.println(value);
    }

	public static void setVal1(int val1) {
		Val1 = val1;
	}

	public static void setVal2(int val2) {
		Val2 = val2;
	}

}
