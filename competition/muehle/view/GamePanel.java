package competition.muehle.view;

import java.awt.Dimension;

import javax.swing.JPanel;

/**
 * GamePanel class
 * 
 * Creates the Game-panel with its size and background and sets it visible
 * 
 * @author trulof
 * @author jbreih
 * @category View
 *
 */
public class GamePanel extends JPanel implements IPanel {

	private static final long serialVersionUID = 1L;

	private int mWidth;
	private int mHeight;

	/**
	 * Constructor
	 * 
	 * Sets member-variables, size and requests focus in Window
	 * 
	 * @param widthIn
	 *            panel-width
	 * @param heightIn
	 *            panel-height
	 * 
	 */
	public GamePanel(int widthIn, int heightIn) {

		System.out.println("Creating JPanel 'GamePanel'...");

		this.mWidth = widthIn;
		this.mHeight = heightIn;

		setPreferredSize(new Dimension(mWidth, mHeight));
		setFocusable(true);
		requestFocus();

		System.out.println("JPanel 'GamePanel' was created successfully.");
	}

	// Getters, mainly for testing purposes
	public int getmWidth() {
		return mWidth;
	}

	public int getmHeight() {
		return mHeight;
	}
}
