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
		String information = "This pokemon is of type: " + this.getClass().getSimpleName();
		return information;
	}
	public String[] getPokemonTypes() 
	{
		String pokemonTypes = "This Pokemon has the following type(s);";
		Class<?> [] types = getClass().getInterfaces();
		String [] pokeTypes = new String[types.length];
		for(int index = 0; index < types.length; index++)
		{
			String temp = types[index].getCanonicalName();
			
			pokeTypes[index] = temp;
		}
		
		for(String current : pokeTypes)
		{
			String temp = current.replace(this.getClass().getPackage().getName() + ".", "");
			pokemonTypes += temp + "\n";
		}
		return pokeTypes;
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
