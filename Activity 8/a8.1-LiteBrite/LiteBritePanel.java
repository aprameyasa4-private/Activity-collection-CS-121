import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Main panel for LiteBrite activities.
 * Top-level organizer and coordinator between sub-panels/controls. 
 * 
 * @author mvail
 */
@SuppressWarnings("serial")
public class LiteBritePanel extends JPanel {
	// private LitePegButton[][] board; //should be the only instance variable
	private final int BOARD_DIMENSION = 20; //for 20x20 grid of buttons
	
	/**
	 * Initialize top-level panel with a single LitePegButton (for testing)
	 * or a grid layout subpanel (final). Also adds a reset button to reset all
	 * pegs (final).
	 */
	public LiteBritePanel() {
		/* 
		 * Phase 1: Enable the following block of code to test the
		 * functionality of a single LitePegButton.
		 * Remove this comment and associated code once LitePegButton 
		 * is working and you are ready to enable the Phase 2 code.
		 * 
		 * Adds a single LitePegButton and a reset button to this
		 * panel for developing and testing the LitePegButton class.
		 */

		// LitePegButton testButton = new LitePegButton();
		// LitePegButtonListener pegListener = new LitePegButtonListener();
		// testButton.addActionListener(pegListener);
		// testButton.setPreferredSize(new Dimension(30, 30));
		// this.add(testButton);
		
		/*
		 * Phase 2: * This is the code that should be enabled in the
		 * final version of LiteBrite.
		 * 
		 * Add a subpanel containing a grid of LitePegButtons and a
		 * subpanel to vertically center a reset button.
		 */	

		//Button for reset and subpanel to hold and vertically center button

		// JButton resetButton = new JButton("Reset");
		// resetButton.setFont (new Font("Arial", Font.PLAIN, 24));
		// resetButton.addActionListener(new ResetButtonListener());
		// JPanel controlPanel = new JPanel();
		// controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));
		// controlPanel.add(Box.createVerticalGlue()); //for vertical centering
		// controlPanel.add(resetButton);
		// controlPanel.add(Box.createVerticalGlue()); //for vertical centering
		
		//Subpanel to display a grid of LitePegButtons
		//Populate the grid subpanel and button array with LitePegButtons
		//  sharing a single listener


		//Set layout of this panel
		//Add subpanels to this panel
		
	}
	
	/**
	 * Private listener class to respond to reset button clicks by
	 * reseting all pegs back to black.
	 */
	private class ResetButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// Call the reset() method of all LitePegButtons in a nested loop.
			
		}
	}

	/**
	 * Private listener class to advance the color of the clicked
	 * LitePegButton.
	 */
	
}