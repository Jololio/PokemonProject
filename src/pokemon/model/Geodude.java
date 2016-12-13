package pokemon.model;

public class Geodude extends Pokemon
{
	public Geodude(String name)
	{
		super(name, 1);
	}
	
	public Geodude(String name, int number)
	{
		super(name, number);
	}
	
	public Geodude(double speed)
	{
		super(50);
	}
	public Geodude(int healthPoints, int attackPoints)
	{
		super(200, 15);
	}
}
