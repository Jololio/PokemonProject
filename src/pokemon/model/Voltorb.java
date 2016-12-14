package pokemon.model;

public class Voltorb extends Pokemon implements Electric
{
	public Voltorb(String name)
	{
		super(name, 5);
	}
	
	public Voltorb(String name, int number)
	{
		super(name, number);
	}
	
	public Voltorb(double speed)
	{
		super(60);
	}
	public Voltorb(int healthPoints, int attackPoints)
	{
		super(150, 25);
	}
	
	public void shock()
	{
		
	}
	
	public void electricute()
	{
		
	}

}
