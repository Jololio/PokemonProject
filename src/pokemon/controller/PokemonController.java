package pokemon.controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import pokemon.model.Pokemon;
import pokemon.view.PokemonFrame;
import pokemon.view.PokemonPanel;


public class PokemonController 
{
	
	
	
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
