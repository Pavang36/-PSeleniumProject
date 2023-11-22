package nopcommerceUtilities;

import Pom.Constants;

public class Staticwaits {
	public static void staticShortWait()
	{
		try 
		{
			Thread.sleep(Constants.SHORT_WAIT);
		} 
		catch(InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void staticLongWait() {
		try 
		{
			Thread.sleep(Constants.LONG_WAIT);
		} 
		catch(InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
