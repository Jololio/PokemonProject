package pokemon.controller;
import pokemon.model.Voltorb;
import java.util.ArrayList;
import pokemon.model.Onix;
import javax.swing.JOptionPane;

import pokemon.model.Electrode;
import pokemon.model.Geodude;
import pokemon.model.Pokemon;
import pokemon.model.Sandslash;
import pokemon.view.PokemonFrame;
import pokemon.view.PokemonPanel;


public class PokemonController 
{
	ArrayList<Pokemon> pokedex;
	PokemonFrame baseFrame; 
	
	/*Initializes and builds pokedex array list
	 * initializes PokemonFrame as well
	 */
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		baseFrame = new PokemonFrame(this);
	}
		
	//Displays a message to the user upon program beginning
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "Welcome to Pokemon Inheritance");
	}
	
	//Array list of Pokemon
	private void buildPokedex()
	{
		pokedex.add(new Geodude("derpy"));
		pokedex.add(new Onix("Pranked"));
		pokedex.add(new Geodude("Rock n' Roll"));
		pokedex.add(new Voltorb("Shocking, I know"));
		pokedex.add(new Voltorb("Electricute and Exicute"));
		pokedex.add(new Onix("Yeah, I know I rock"));
		pokedex.add(new Sandslash("I love the beach, cause of the sand."));
		pokedex.add(new Electrode("Zap!"));
	}

	//Will update the selected pokemon's property
	public void updateSelected(int index, String name, int attackPoints, int healthPoints, double speed)
	{
		Pokemon current = pokedex.get(index);
		current.setAttackPoints(attackPoints);
		current.setHealthPoints(healthPoints);
		current.setName(name);
		current.setSpeed(speed);
	}
	
	//Will return the Pokedex
	public ArrayList<Pokemon> getPokedex() 
	{
		return pokedex;
	}

	//Will return the baseFrame
	public PokemonFrame getBaseFrame() 
	{
		return baseFrame;
	}

}
