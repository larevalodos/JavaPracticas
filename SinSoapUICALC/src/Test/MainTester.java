package Test;
import java.rmi.RemoteException;

/**
 * MainTester.java
 *
 */
public class MainTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
	
		 org.tempuri.CalculatorSoapStub binding = null;
	        try {
	            binding = (org.tempuri.CalculatorSoapStub)
	                          new org.tempuri.CalculatorLocator().getCalculatorSoap();
	        }
	        catch (javax.xml.rpc.ServiceException jre) {
	            if(jre.getLinkedCause()!=null)
	                jre.getLinkedCause().printStackTrace();
	        }
	      
	        // Time out after a minute
	        binding.setTimeout(60000);

	        // Test operation
	        int value = -3;
	        try {
				value = binding.add(6,5);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        // TBD - validate results
	
		
		System.out.println(value);
		
	}
}
