package pokemon.model;

public class Onix extends Pokemon implements Rock, Ground
{
	//Name of pokemon
	public Onix(String name)
	{
		super(name, 2);
	}
	
	//Name/Number of pokemon
	public Onix(String name, int number)
	{
		super(name, number);
	}
	
	//Speed
	public Onix(double speed)
	{
		super(40);
	}
	//Health/Attack points
	public Onix(int healthPoints, int attackPoints)
	{
		super(250, 20);
	}
	
	//Crush attack method
	public void crush()
	{
		
	}
	//Avalanche attack method
	public void avalanche()
	{
		
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

