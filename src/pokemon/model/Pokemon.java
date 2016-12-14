package pokemon.model;


public abstract class Pokemon 
{
	private int number;
	private String information;
	private String pokeType;
	private String name;
	private double attackPoints;
	private double speed;
	private double healthPoints;
	
	public Pokemon(String name, int number)
	{
		
	}
	public Pokemon(double speed)
	{
		
	}
	public Pokemon(int healthPoints, int attackPoints)
	{
		
	}
	public String getName() 
	{
		return name;
	}
	public int getNumber() 
	{
		return number;
	}
	public double getAttackPoints() 
	{
		return attackPoints;
	}
	public double getSpeed() 
	{
		return speed;
	}
	public double getHealthPoints() 
	{
		return healthPoints;
	}
	public String getPokemonInformation() 
	{
		return information;
	}
	public String getPokemonTypes() 
	{
		return pokeType;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setHealthPoints(int healthPoints)
	{
		this.healthPoints = healthPoints;
	}
	public void setAttackPoints(double attackPoints)
	{
		this.attackPoints = attackPoints;
	}
	public void setSpeed(double speed)
	{
		this.speed = speed;
	}
	
}
