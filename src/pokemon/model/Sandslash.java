package pokemon.model;

public class Sandslash extends Pokemon implements Ground
{
	//Name
	public Sandslash(String name)
	{
		super(name, 3);
	}
		
	//Name/Number
	public Sandslash(String name, int number)
	{
		super(name, number);
	}
		
	//Speed
	public Sandslash(double speed)
	{
		super(40);
	}
	//Health/Attack points
	public Sandslash(int healthPoints, int attackPoints)
	{
		super(225, 25);
	}
	
	//Punch attack method
	public void punch()
	{
		
	}
	
	//Lunge attack method
	public void lunge()
	{
		
	}
	
	
	
}
