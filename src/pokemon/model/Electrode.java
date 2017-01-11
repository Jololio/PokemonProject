package pokemon.model;

public class Electrode extends Pokemon implements Electric
{
	//Name
	public Electrode(String name)
	{
		super(name, 4);
	}
	
	//Name/Number
	public Electrode(String name, int number)
	{
		super(name, number);
	}

	//Speed
	public Electrode(double speed)
	{
		super(75);
	}
	//Health/Attack points
	public Electrode(int healthPoints, int attackPoints)
	{
		super(175, 30);
	}
	
	//Shock attack method
	public void shock()
	{
		
	}
	
	//Electricute attack method
	public void electricute()
	{
		
	}
	
	
	
}
