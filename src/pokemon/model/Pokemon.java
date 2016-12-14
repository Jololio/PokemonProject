package pokemon.model;


public abstract class Pokemon 
{
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
	public String getName(String name) 
	{
		return name;
	}
	public int getNumber(int number) 
	{
		return number;
	}
	public double getAttackPoints(double attackPoints) 
	{
		return attackPoints;
	}
	public double getSpeed(double speed) 
	{
		return speed;
	}
	public double getHealthPoints(double healthPoints) 
	{
		return healthPoints;
	}
	public String getPokemonInformation(String information) 
	{
		return information;
	}
	public String getPokemonTypes(String pokeType) 
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
