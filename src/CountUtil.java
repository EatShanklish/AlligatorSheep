

public class CountUtil
    {
	static int count = 0;
	
	public static void count(Countable c, int maxCount)
	{
	   
	    
	    
	    for ( int i = 1 ; i <= maxCount ; i++ )
		{	    
		    c.incrementCount();
		    System.out.println(c.getCountString());
		}
	}
    }
