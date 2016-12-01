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
	private JTextArea advancedArea;
	private JTextField healthField;
	private JButton updateButton;
	private ImageIcon pokemonIcon;
	private JComboBox pokedexSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	
	
	public PokemonPanel(PokemonController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		advancedArea = new JTextArea();
		healthField = new JTextField();
		updateButton = new JButton();
		pokemonIcon = new ImageIcon();
		pokedexSelector = new JComboBox();
		pokemonLabel = new JLabel();
		healthLabel = new JLabel();
		combatLabel = new JLabel();
		speedLabel = new JLabel();
		nameLabel = new JLabel();
		numberLabel = new JLabel();
		advancedLabel = new JLabel();
		combatField = new JTextField();
		speedField = new JTextField();
		nameField = new JTextField();
		numberField = new JTextField();
		
		
		setupLayout();
		setupPokemonDisplay();
		setupPanel();
		setupListeners();
	}
	
	private void setupPokemonDisplay()
	{
		advancedArea.setEditable(false);
		advancedArea.setEnabled(false);
		advancedArea.setLineWrap(true);
		advancedArea.setWrapStyleWord(true);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.LIGHT_GRAY);
		this.add(advancedArea);
		this.add(healthField);
		this.add(updateButton);
		this.add(combatField);
		this.add(speedField);
		this.add(nameField);
		this.add(numberField);
		this.add(combatLabel);
		this.add(advancedLabel);
		this.add(pokemonLabel);
		this.add(healthLabel);
		this.add(speedLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(pokedexSelector);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
}
