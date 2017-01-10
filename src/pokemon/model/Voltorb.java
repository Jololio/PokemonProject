package pokemon.model;

public class Voltorb extends Pokemon implements Electric
{
	//Name
	public Voltorb(String name)
	{
		super(name, 5);
	}
	
	//Name/Number
	public Voltorb(String name, int number)
	{
		super(name, number);
	}
	
	//Speed
	public Voltorb(double speed)
	{
		super(60);
	}
	//Health/Attack points
	public Voltorb(int healthPoints, int attackPoints)
	{
		super(150, 25);
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
