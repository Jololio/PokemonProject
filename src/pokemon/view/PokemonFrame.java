package pokemon.view;

import javax.swing.JFrame;
import pokemon.controller.PokemonController;
import java.awt.Dimension;


//Frame for the window
public class PokemonFrame extends JFrame
	{
		private PokemonController baseController;
		private PokemonPanel basePanel;
		
		//Sets up the frame
		public PokemonFrame(PokemonController baseController)
		{
			super();
			this.baseController = baseController;
			basePanel = new PokemonPanel(baseController);
			
			setupFrame();
		}
		
		//Frame properties
		private void setupFrame()
		{
			this.setContentPane(basePanel);
			this.setTitle("Pokemon");
			this.setSize(new Dimension(600, 400));
			this.setResizable(false);
			this.setVisible(true);
		}
	}
