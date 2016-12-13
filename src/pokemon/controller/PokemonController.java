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
	
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		baseFrame = new PokemonFrame(this);
	}
		
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "Welcome to Pokemon Inheritance");
	}
	
	private void buildPokedex()
	{
		pokedex.add(new Geodude("derpy"));
		pokedex.add(new Onix("Pranked"));
		pokedex.add(new Geodude("Rock n' Roll"));
		pokedex.add(new Voltorb("Shocking, I know"));
	}
	
}
