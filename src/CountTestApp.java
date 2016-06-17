

public class CountTestApp extends CountUtil implements Cloneable
    {
	public static void main( String[] args )
	{
	    Alligator gator = new Alligator();
	    
	    System.out.println("Counting Alligators");
	    System.out.println(" ");
	    
	    count(gator, 3);		
	    
	    
	    Sheep sheep1 = new Sheep();
	    sheep1.setName("Blackie");
	    
	    System.out.println(" ");
	    System.out.println("Counting Sheep..");
	    System.out.println(" ");
	    
	    count(sheep1, 2);
	    
	    Sheep clone = sheep1.clone();
	    
	    clone.setName("Dolly");
	    
	    System.out.println(" ");
	    
	    count(clone, 3);
	    
	    
	    
	   
	}
    }
