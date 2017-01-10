package pokemon.controller;
import pokemon.model.Voltorb;
import java.util.ArrayList;
import pokemon.model.Onix;
import javax.swing.JOptionPane;
import pokemon.model.Geodude;
import pokemon.model.Pokemon;
import pokemon.view.PokemonFrame;
import pokemon.view.PokemonPanel;


public class PokemonController 
{
	ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
	PokemonFrame baseFrame = new PokemonFrame(this);
	
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
