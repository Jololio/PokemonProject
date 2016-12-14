package pokemon.model;

public class Onix extends Pokemon implements Rock, Ground
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
	
	public void crush()
	{
		
	}
	public void avalanche()
	{
		
	}
	public void punch()
	{
		
	}
	public void lunge()
	{
		
	}
}

