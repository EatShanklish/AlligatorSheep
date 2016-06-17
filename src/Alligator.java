

public class Alligator implements Countable
    {
	public int gatorCount;
	
	public int getCount()
	{
	    return gatorCount;	// TO-DO format count? 
	}

	@Override
	public void incrementCount()
	{
	    gatorCount++;
	    
	}

	@Override
	public void resetCount()
	{
	    gatorCount = 0;
	}

	@Override
	public String getCountString()
	{
	    
	    return (gatorCount + " Alligators");
	}
    }
