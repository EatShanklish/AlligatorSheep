

public class Sheep extends CountUtil implements Cloneable, Countable
    {
	 int sheepCount;
	private String name;
	
	
	
	@Override
	public Sheep clone()
	{
	   Sheep sheep2 = new Sheep();
	   sheep2.setName(name);
	   
	   return sheep2;
	}
	
	public String getName()
	{
	    return name;
	}
	
	public void setName(String n)
	{
	    name = n;
	}


	@Override
	public void incrementCount()
	{
	    sheepCount++;
	    
	}


	

	@Override
	public int getCount()
	{
	    // TODO Auto-generated method stub
	    return 0;
	}


	@Override
	public String getCountString()
	{
	   return (sheepCount + " " + name);
	}

	@Override
	public void resetCount()
	{
	    // TODO Auto-generated method stub
	    
	}
    }
