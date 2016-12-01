package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private SpringLayout baseLayout;
	private JTextArea pokemonDisplay;
	private JTextField pokemonField;
	private JButton pokemonButton;
	
	
	public PokemonPanel(PokemonController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		pokemonDisplay = new JTextArea();
		pokemonField = new JTextField();
		pokemonButton = new JButton();
		
		
		setupLayout();
		setupPokemonDisplay();
		setupPanel();
		setupListeners();
	}
	
	private void setupPokemonDisplay()
	{
		pokemonDisplay.setEditable(false);
		pokemonDisplay.setEnabled(false);
		pokemonDisplay.setLineWrap(true);
		pokemonDisplay.setWrapStyleWord(true);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.LIGHT_GRAY);
		this.add(pokemonDisplay);
		this.add(pokemonField);
		this.add(pokemonButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
}
