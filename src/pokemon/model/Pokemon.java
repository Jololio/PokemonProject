package pokemon.model;

//Pokemon parent class which all pokemon classes inherit from
public abstract class Pokemon 
{
	private int number;
	private String information;
	private String pokeType;
	private String name;
	private double attackPoints;
	private double speed;
	private double healthPoints;
	
	//Name
	public Pokemon(String name, int number)
	{
		
	}
	//Speed
	public Pokemon(double speed)
	{
		
	}
	//Health/Attack points
	public Pokemon(int healthPoints, int attackPoints)
	{
		
	}
	//Returns name
	public String getName() 
	{
		return name;
	}
	//Returns number
	public int getNumber() 
	{
		return number;
	}
	//Returns Attack points
	public double getAttackPoints() 
	{
		return attackPoints;
	}
	//Returns speed
	public double getSpeed() 
	{
		return speed;
	}
	//Returns Health Points
	public double getHealthPoints() 
	{
		return healthPoints;
	}
	//Displays the Poketype
	public String getPokemonInformation() 
	{
		String information = "This pokemon is of type: " + this.getClass().getSimpleName();
		return information;
	}
	//Returns poketype
	public String getPokemonTypes() 
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
		return pokemonTypes;
	}
	//Will change pokemon's name
	public void setName(String name)
	{
		this.name = name;
	}
	//Will change the Pokemon's health points
	public void setHealthPoints(int healthPoints)
	{
		this.healthPoints = healthPoints;
	}
	//Will change the Pokemon's attack points
	public void setAttackPoints(double attackPoints)
	{
		this.attackPoints = attackPoints;
	}
	//Will change the Pokemon's speed
	public void setSpeed(double speed)
	{
		this.speed = speed;
	}
	
}
