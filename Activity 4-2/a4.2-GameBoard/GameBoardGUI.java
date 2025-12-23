import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Module 4 Week 2 - Game Board
 * Draws a game board with alternating black and red squares
 * 
 * @author CS121 Instructors
 * @author [your name]  
 */

@SuppressWarnings("serial")
public class GameBoardGUI extends JPanel
{
	private int numRows;
	private int numCols;

	/**
	 * Sets the initial dimensions of the panel based on the passed information for rows and columns. 
         * @param rows the number of rows
	 * @param cols the number of columns
	 */
	public GameBoardGUI(int rows, int cols)
	{
		// You will prompt for these sizes in main()
		numRows = rows;
		numCols = cols;
		setPreferredSize(new Dimension(500, 500));
	}

	/**
	 *  Draws the game board.
	 *  @param page Graphics context
	 */
	public void paintComponent(Graphics page)
	{
		int width = getWidth();
		int height = getHeight();

		int boxWidth = (int) Math.ceil((double) width/numCols);
		int boxHeight = (int) Math.ceil((double) height/numRows);

		page.setColor(Color.RED);
		page.fillRect(0, 0, boxWidth, boxHeight);

		// TODO: Add your code here to draw the GUI board
                
	}

	/**
	 * Creates the main frame of the program.
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO: Get dimensions from user for rows and columns (variables must have these names, see code below)


		
		JFrame frame = new JFrame("Game Board");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GameBoardGUI panel = new GameBoardGUI(rows, columns);
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}