package pokemon.model;

public class Geodude extends Pokemon implements Rock
{
	//Name of pokemon
	public Geodude(String name)
	{
		super(name, 1);
	}
	
	//Name and number
	public Geodude(String name, int number)
	{
		super(name, number);
	}
	
	//Speed of pokemon
	public Geodude(double speed)
	{
		super(50);
	}
	//Health/Attack points of pokemon
	public Geodude(int healthPoints, int attackPoints)
	{
		super(200, 15);
	}
	
	//Crush attack method
	public void crush()
	{
		
	}
	
	//Avalanche attack method
	public void avalanche()
	{
		
	}
}
