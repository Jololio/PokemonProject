package pokemon.model;

public class Onix extends Pokemon 
{
	public Onix(String name)
	{
		super(name, 2);
	}
	
	public Onix(String name, int number)
	{
		super(name, number);
	}
	
	public Onix(double speed)
	{
		super(40);
	}
	public Onix(int healthPoints, int attackPoints)
	{
		super(250, 20);
	}
}
