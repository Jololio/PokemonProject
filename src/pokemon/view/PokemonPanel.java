package pokemon.view;

import pokemon.controller.PokemonController;

import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
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
		this.pokemonIcon = new ImageIcon(getClass().getResource("/poke/view/"));
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
		this.setPreferredSize(new Dimension(900, 600));
		
		numberField.setEditable(false);
		numberField.setBackground(Color.GRAY);
		advancedArea.setEditable(false);
		advancedArea.setWrapStyleWord(true);
		advancedArea.setLineWrap(true);
		
		pokemonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pokemonLabel.setHorizontalTextPosition(JLabel.CENTER);
		
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
		baseLayout.putConstraint(SpringLayout.WEST, advancedArea, -198, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedArea, -37, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedArea, 114, SpringLayout.SOUTH, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, advancedArea, 0, SpringLayout.EAST, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, 44, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, healthField, -47, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, healthField, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 6, SpringLayout.SOUTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, -60, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, 10, SpringLayout.SOUTH, healthField);
		baseLayout.putConstraint(SpringLayout.WEST, combatField, -37, SpringLayout.EAST, advancedArea);
		baseLayout.putConstraint(SpringLayout.EAST, combatField, 0, SpringLayout.EAST, advancedArea);
	}
	
	private void setupListeners()
	{
		pokedexSelector.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selected = pokedexSelector.getSelectedIndex();
				nameField.setText(baseController.getPokedex().get(selected).getName());
				numberField.setText(baseController.getPokedex().get(selected).getNumber() + "");
				combatField.setText(baseController.getPokedex().get(selected).getAttackPoints() + "");
				speedField.setText(baseController.getPokedex().get(selected).getSpeed() + "");
				healthField.setText(baseController.getPokedex().get(selected).getHealthPoints() + "");
				advancedArea.setText(baseController.getPokedex().get(selected).getPokemonInformation() + "\n\n" + baseController.getPokedex().get(selected).getPokemonTypes());
				changeColorBasedOnData(baseController.getPokedex().get(selected).getPokemonTypes());
				changeImageDisplay(baseController.getPokedex().get(selected).getClass().getSimpleName());
			}
		});
		
		updateButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				if(isValidName(nameField.getText()) && isValidInteger(combatField.getText()) && isValidInteger(healthField.getText()))
				{
					int selected = pokedexSelector.getSelectedIndex();
					baseController.getPokedex().get(selected).setName(nameField.getText());
					baseController.getPokedex().get(selected).setHealthPoints(Integer.parseInt(healthField.getText()));
					baseController.getPokedex().get(selected).setAttackPoints(Integer.parseInt(combatField.getText()));
					baseController.getPokedex().get(selected).setSpeed(Double.parseDouble(speedField.getText()));
				}
			}
		});
	}
	
	private void changeColorBasedOnData(String data)
	{
		if (data.contains("Electric"))
		{
			this.setBackground(Color.YELLOW);
		}
		else if (data.contains("Fire"))
		{
			this.setBackground(Color.RED);
		}
		else if (data.contains("Ground"))
		{
			this.setBackground(Color.ORANGE);
		}
		else if (data.contains("Rock"))
		{
			this.setBackground(Color.LIGHT_GRAY);
		}
		else
		{
			this.setBackground(Color.MAGENTA);
		}
		
		repaint();
	}
	
	private void changeImageDisplay(String name)
	{
		String path = "/poke/view/images/";
		String defaultName = "ultraball";
		String extension = ".png";
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		pokemonLabel.setIcon(pokemonIcon);
		repaint();
	}
}
